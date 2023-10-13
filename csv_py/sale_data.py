import random
import datetime

# Define the number of days and weeks
order_id = 1
drink_id = 1
topping_id = 1
total = 0
toppings = ["boba", "lychee coconut jelly", "sago", "aiyu", "agar boba", "aloe vera", "cheese foam", "red bean", "black glutinous rice", "grass jelly", "taro mochi"]
peak_days = ["2022-08-25", "2022-05-12"]
drinks_dict = {
    "sun moon lake black tea": 4.25,
    "pouchong green tea": 4.25,
    "songboling mountain tea": 4.25,
    "lugu oolong tea": 4.25,
    "tea w/ original salty cream": 4.99,
    "brown sugar pearl latte": 6.25,
    "brown sugar pearl milk tea": 6.25,
    "brown sugar pearl matcha latte": 6.45,
    "traditional milk tea": 4.99,
    "super trio traditional milk tea": 5.75,
    "tea latte": 5.25,
    "matcha latte":	5.99,
    "peach green milk tea":	5.99,
    "avocado mango agar cooler": 7.49,
    "mango pomelo sago cooler":	7.75,
    "yiFang taiwan fruit tea": 5.75,
    "watermelon coconut agar cooler": 6.25,
    "kumquat passionfruit tea": 5.25,
    "green plum green tea": 4.99,
    "peach fruit tea": 5.49,
    "peach soda pop": 5.49,
    "strawberry fruit tea":	6.25,
    "strawberry milk (blended)": 6.25,
    "yakult fruit tea":	5.99,
    "passionfruit green tea": 5.25,
    "pineapple green tea": 5.25,
    "wintermelon lemon tea": 4.99,
    "lemon mountain tea": 4.99,
    "lemon green tea": 4.99,
    "aiyu jelly lemon tea":	4.99,
    "sugarcane mountain tea": 6.25,
    "sugarcane lemon mountain tea":	6.25,
    "fresh taro latte":	5.99,
    "fresh taro green tea latte": 5.99,
    "sweet taro sago latte": 6.75,
    "red bean black glutinous rice with coconut latte": 6.25,
    "red bean sago latte": 6.25,
    "red bean match frappe with boba": 6.25,
    "super trio wintermelon tea": 5.00,
    "wintermelon tea": 4.25,
    "wintermelon latte": 4.75,
    "grass jelly tea": 4.25,
    "black sesame milk": 6.25,
    "thai tea": 4.25
}
drink_ingredient_dict = {
    "sun moon lake black tea": ["black tea"],
    "pouchong green tea": ["green tea"],
    "songboling mountain tea": ["mountain tea"],
    "lugu oolong tea": ["oolong tea"],
    "tea w/ original salty cream": ["black/green/oolong tea", "salty cream"],
    "brown sugar pearl latte": ["brown sugar", "boba", "milk"],
    "brown sugar pearl milk tea": ["brown sugar", "boba", "black tea", "non dairy creamer"],
    "brown sugar pearl matcha latte": ["brown sugar", "uji matcha", "milk"],
    "traditional milk tea": ["black/green/oolong tea", "non dairy creamer"],
    "super trio traditional milk tea": ["black/green/oolong tea", "non dairy creamer", "boba", "grass jelly", "aiyu jelly"],
    "tea latte": ["fresh milk", "black/green/oolong tea"],
    "matcha latte":	["uji matcha", "milk"],
    "peach green milk tea":	["peach chunk", "milk", "green tea"],
    "avocado mango agar cooler": ["blended avocado", "fresh milk", "coconut milk", "mango chunks", "pomelo", "agar boba"],
    "mango pomelo sago cooler":	["fresh mango", "coconut milk", "pomelo", "sago"],
    "yiFang taiwan fruit tea": ["roasted ripe pineapple", "passionfruit seeds", "lime juice", "mountain tea", "orange", "apple"],
    "watermelon coconut agar cooler": ["fresh watermelon", "coconut milk", "agar boba"],
    "kumquat passionfruit tea": ["passionfruit seeds", "green tea", "kumquat", "lime slices"],
    "green plum green tea": ["green plum", "green tea"],
    "peach fruit tea": ["peach", "lime juice", "mountain tea"],
    "peach soda pop": ["peach chunk", "7 up", "lime", "mountain tea"],
    "strawberry fruit tea":	["fresh strawberries", "lime", "green tea"],
    "strawberry milk (blended)": ["blended strawberries", "fresh milk"],
    "yakult fruit tea":	["yakult", "green tea", "passionfruit/pineapple/orange"],
    "passionfruit green tea": ["passionfruit seeds", "lime juice", "green tea"],
    "pineapple green tea": ["pineapple", "green tea"],
    "wintermelon lemon tea": ["wintermelon tea", "lime juice", "lime slices"],
    "lemon mountain tea": ["mountain tea", "lime juice", "lime slices"],
    "lemon green tea": ["green tea", "lime juice", "lime slices"],
    "aiyu jelly lemon tea":	["green tea", "aiyu jelly", "lime juice", "lime slices"],
    "sugarcane mountain tea": ["fresh sugarcane juice", "mountain tea"],
    "sugarcane lemon mountain tea":	["fresh sugarcane juice", "lime slices", "lime juice", "mountain tea"],
    "fresh taro latte":	["taro chunk", "milk"],
    "fresh taro green tea latte": ["taro chunk", "milk", "green tea"],
    "sweet taro sago latte": ["blended taro paste", "milk", "sago"],
    "red bean black glutinous rice with coconut latte": ["red bean", "black glutinous rice", "coconut milk", "fresh milk"],
    "red bean sago latte": ["blended red bean", "milk", "sago"],
    "red bean match frappe with boba": ["blended uji matcha", "milk", "boba", "red bean"],
    "super trio wintermelon tea": ["wintermelon tea", "boba", "grass jelly", "sago"],
    "wintermelon tea": ["wintermelon tea"],
    "wintermelon latte": ["wintermelon", "fresh milk"],
    "grass jelly tea": ["grass jelly", "black tea"],
    "black sesame milk": ["black sesame milk", "cheese foam"],
    "thai tea": ["thai tea"]
}

ingredient_dict = {
    "black tea": 1,
    "green tea": 2,
    "oolong tea": 3,
    "mountain tea": 4,
    "salty cream": 5,
    "brown sugar": 6,
    "milk": 7,
    "non dairy creamer": 8,
    "uji matcha": 9,
    "fresh milk": 10,
    "peach chunk": 11,
    "blended avocado": 12,
    "coconut milk": 13,
    "pomelo": 14,
    "fresh mango": 15,
    "roasted ripe pineapple": 16,
    "passionfruit seeds": 17,
    "lime juice": 18,
    "orange": 19,
    "apple": 20,
    "fresh watermelon": 21,
    "kumquat": 22,
    "lime slices": 23,
    "green plum": 24,
    "peach": 25,
    "7 up": 26,
    "fresh strawberries": 27,
    "wintermelon": 28,
    "yakult": 29,
    "pineapple": 30,
    "wintermelon tea": 31,
    "fresh sugarcane juice": 32,
    "taro chunk": 33,
    "blended taro paste": 34,
    "black sticky rice": 35,
    "blended red bean": 36,
    "black sesame milk": 37,
    "thai tea": 38,
    "boba": 39,
    "lychee coconut jelly": 40,
    "sago": 41,
    "aiyu jelly": 42,
    "agar boba": 43,
    "aloe vera": 44,
    "cheese foam": 45,
    "red bean": 46,
    "black glutinous rice": 47,
    "grass jelly": 48,
    "taro mochi": 49,
    "mango chunks": 50,
    "lime": 51,
    "blended uji matcha": 52,
    "blended strawberries": 53,
    "cups": 54,
    "straws": 55,
    "lids": 56,
}

x = open("drinks_data.csv", "w+")
y = open("addons_data.csv", "w+")
z = open("ingredients_data.csv", "w+")
with open("yifang_data.csv", "w+") as f:

    for i in range(1, 85000):
        staff_id = random.randint(1, 10)  # Random staff_id between 1 and 10
        payment_method = 'Card' if random.random() < 0.7 else 'Cash'  # 70% Card, 30% Cash
        transaction_date = str(datetime.date(2022, 1, 1) + datetime.timedelta(days = random.randint(0, 365)))
        transaction_time =  str(random.randint(10, 22)) + ":" + f"{random.randint(0, 59):02d}" + ":" + f"{random.randint(0, 59):02d}"

        payment_amount = 0
        
        temp = random.random()
        if temp < 0.05:
            num_drinks = 5
        elif temp < 0.15:
            num_drinks = 4
        elif temp < 0.30:
            num_drinks = 3
        elif temp < 0.50:
            num_drinks = 2
        else:
            num_drinks = 1
        
        for i in range(num_drinks):
            temp = random.random()
            if temp < 0.10:
                topping = 3
            elif temp < 0.20:
                topping = 2
            elif temp < 0.50:
                topping = 1
            else:
                topping = 0
            
            #
            drink = random.choice(list(drinks_dict.items()))
            x.write(str(drink_id) + ", " + str(order_id) + ", " + drink[0] + ", " + str(drink[1]) + ", " + str(topping) + "\n")
            payment_amount += drink[1] + (topping * 0.75)
            
            for i in drink_ingredient_dict[drink[0]]:
                if "black/" in i:
                    i = "green tea"
                elif "pineapple/" in i:
                    i = "pineapple"
                z.write(str(drink_id) + ", " + str(ingredient_dict[i]) + "\n")
            z.write(str(drink_id) + ", " + str(ingredient_dict["cups"]) + "\n")
            z.write(str(drink_id) + ", " + str(ingredient_dict["lids"]) + "\n")
            z.write(str(drink_id) + ", " + str(ingredient_dict["straws"]) + "\n")
            
            for i in range(topping):
                temp = random.choice(toppings)
                y.write(str(topping_id) + ", " + str(drink_id) + ", " + random.choice(toppings) + "\n")
                topping_id += 1
            
            drink_id += 1

        f.write(str(order_id) + ' ')
        f.write(str(staff_id) + ' ')
        f.write(transaction_date + ' ')
        f.write(payment_method + ' ')
        f.write(f'{payment_amount + (payment_amount * 0.0725):.2f}' + ' ')
        f.write(transaction_time + '\n')

        total += payment_amount
        order_id += 1
        
    for i in range(1500):
        staff_id = random.randint(1, 10)  # Random staff_id between 1 and 10
        payment_method = 'Card' if random.random() < 0.7 else 'Cash'  # 70% Card, 30% Cash
        transaction_time =  str(random.randint(10, 22)) + ":" + f"{random.randint(0, 59):02d}" + ":" + f"{random.randint(0, 59):02d}"
        
        payment_amount = 0
        
        temp = random.random()
        if temp < 0.05:
            num_drinks = 5
        elif temp < 0.15:
            num_drinks = 4
        elif temp < 0.30:
            num_drinks = 3
        elif temp < 0.50:
            num_drinks = 2
        else:
            num_drinks = 1
        
        for i in range(num_drinks):
            temp = random.random()
            if temp < 0.10:
                topping = 3
            elif temp < 0.20:
                topping = 2
            elif temp < 0.50:
                topping = 1
            else:
                topping = 0
            
            drink = random.choice(list(drinks_dict.items()))
            x.write(str(drink_id) + ", " + str(order_id) + ", " + drink[0] + ", " + str(drink[1]) + ", " + str(topping) + "\n")
            payment_amount += drink[1] + (topping * 0.75)
            
            for i in drink_ingredient_dict[drink[0]]:
                if "black/" in i:
                    i = "green tea"
                elif "pineapple/" in i:
                    i = "pineapple"
                z.write(str(drink_id) + ", " + str(ingredient_dict[i]) + "\n")
            z.write(str(drink_id) + ", " + str(ingredient_dict["cups"]) + "\n")
            z.write(str(drink_id) + ", " + str(ingredient_dict["lids"]) + "\n")
            z.write(str(drink_id) + ", " + str(ingredient_dict["straws"]) + "\n")
            
            for i in range(topping):
                temp = random.choice(toppings)
                y.write(str(topping_id) + ", " + str(drink_id) + ", " + random.choice(toppings) + "\n")
                topping_id += 1
            drink_id += 1

        f.write(str(order_id) + ' ')
        f.write(str(staff_id) + ' ')
        f.write(random.choice(peak_days) + ' ')
        f.write(payment_method + ' ')
        f.write(f'{payment_amount + (payment_amount * 0.0725):.2f}' + ' ')
        f.write(transaction_time + '\n')

        total += payment_amount
        order_id += 1

y.close()
x.close()
print(total)