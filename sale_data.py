import random
import datetime

# Define the number of days and weeks
num_weeks = 52
days_per_week = 7
total_days = num_weeks * days_per_week
order_ids = 1
total = 0
drinks = []
toppings = ["Boba", "Lychee Coconut Jelly", "Sago", "Aiyu", "Agar Boba", "Aloe Vera", "Cheese Foam", "Red Bean", "Black Glutinous Rice", "Grass Jelly", "Taro Mochi"]
peak_days = ["2022-08-25", "2022-05-12"]
drinks_dict = {
    "sun moon lake black tea": [4.25, 101],
    "pouchong green tea": [4.25, 102],
    "songboling mountain tea": [4.25, 103],
    "lugu oolong tea": [4.25, 104],
    "tea w/ original salty cream": [4.99, 105],
    "brown sugar pearl latte": [6.25, 201],
    "brown sugar pearl milk tea": [6.25, 202],
    "brown sugar pearl matcha latte": [6.45, 203],
    "traditional milk tea": [4.99, 301],
    "super trio traditional milk tea": [5.75, 302],
    "tea latte": [5.25, 303],
    "matcha latte":	[5.99, 304],
    "peach green milk tea":	[5.99, 305],
    "avocado mango agar cooler": [7.49, 401],
    "mango pomelo sago cooler":	[7.75, 402],
    "yiFang taiwan fruit tea": [5.75, 403],
    "watermelon coconut agar cooler": [6.25, 404],
    "kumquat passion gruit tea": [5.25, 405],
    "green plum green tea": [4.99, 406],
    "peach fruit tea": [5.49, 407],
    "peach soda pop": [5.49, 408],
    "strawberry fruit tea":	[6.25, 409],
    "strawberry milk (blended)": [6.25, 410],
    "yakult fruit tea":	[5.99, 411],
    "passion fruit green tea": [5.25, 412],
    "pineapple green tea": [5.25, 413],
    "winter melon lemon tea": [4.99, 414],
    "lemon mountain tea": [4.99, 415],
    "lemon green tea": [4.99, 416],
    "aiyu jelly lemon tea":	[4.99, 417],
    "sugarcane mountain tea": [6.25, 501],
    "sugarcane lemon mountain tea":	[6.25, 502],
    "fresh taro latte":	[5.99, 601],
    "fresh taro green tea latte": [5.99, 602],
    "sweet taro sago latte": [6.75, 603],
    "red bean black glutinous rice with coconut latte": [6.25, 604],
    "red bean sago latte": [6.25, 605],
    "red bean match frappe with boba": [6.25, 606],
    "super trio winter melon tea": [5.00, 701],
    "winter melon tea": [4.25, 702],
    "winter melon latte": [4.75, 703],
    "grass jelly tea": [4.25, 704],
    "black sesame milk": [6.25, 705],
    "thai tea": [4.25, 706]
}
ingredient_dict = {
    "sun moon lake black tea": ["black tea"],
    "pouchong green tea": ["green tea"],
    "songboling mountain tea": ["mountain tea"],
    "lugu oolong tea": ["oolong tea"],
    "tea w/ original salty cream": ["black/green/oolong tea", "salty cream"],
    "brown sugar pearl latte": ["brown sugar", "boba", "milk"],
    "brown sugar pearl milk tea": ["brown sugar", "boba", "black tea", "nondairy creamer"],
    "brown sugar pearl matcha latte": ["brown sugar", "uji matcha", "milk"],
    "traditional milk tea": ["black/green/oolong tea", "non-dairy creamer"],
    "super trio traditional milk tea": ["black/green/oolong tea", "non-dairy creamer", "choose 3 toppings"],
    "tea latte": ["fresh milk", "black/green/oolong tea"],
    "matcha latte":	["uji matcha", "milk"],
    "peach green milk tea":	["peach chunk", "milk", "green tea"],
    "avocado mango agar cooler": ["blended avocado", "fresh milk", "coconut milk", "mango chunks", "pomelo", "agar boba"],
    "mango pomelo sago cooler":	["fresh mango", "coconut milk", "pomelo", "sago"],
    "yiFang taiwan fruit tea": ["roasted ripe pineapple", "passionfruit seeds", "freshly squeezed lime juice", "mountain tea", "orange", "apple"],
    "watermelon coconut agar cooler": ["fresh watermelon", "coconut milk", "agar boba"],
    "kumquat passion gruit tea": ["passionfruit seeds", "green tea", "kumquat", "lime slices"],
    "green plum green tea": ["green plum", "green tea"],
    "peach fruit tea": ["peach", "lime juice", "mountain tea"],
    "peach soda pop": ["peach chunk", "7 up", "lime", "mountain tea"],
    "strawberry fruit tea":	["fresh strawberries", "lime", "green tea"],
    "strawberry milk (blended)": ["blended strawberries", "fresh milk"],
    "yakult fruit tea":	["yakult", "green tea", "passionfruit/pineapple/orange"],
    "passion fruit green tea": ["passion fruit seeds", "lime juice", "green tea"],
    "pineapple green tea": ["pineapple", "green tea"],
    "winter melon lemon tea": ["winter melon tea", "lime juice", "lime slices"],
    "lemon mountain tea": ["mountain tea", "lime juice", "lime slices"],
    "lemon green tea": ["green tea", "lime juice", "lime slices"],
    "aiyu jelly lemon tea":	["green tea", "aiyu jelly", "lime juice", "lime slices"],
    "sugarcane mountain tea": ["fresh sugarcane juice", "mountain tea"],
    "sugarcane lemon mountain tea":	["fresh sugarcane juice", "lime slices", "lime juice", "mountain tea"],
    "fresh taro latte":	["taro chunk", "milk"],
    "fresh taro green tea latte": ["taro chunk", "milk", "green tea"],
    "sweet taro sago latte": ["blended taro paste", "milk", "sago"],
    "red bean black glutinous rice with coconut latte": ["red bean", "black sticky rice", "coconut milk", "fresh milk"],
    "red bean sago latte": ["blended red bean", "milk", "sago"],
    "red bean match frappe with boba": ["blended uji matcha", "milk", "boba", "red bean"],
    "super trio winter melon tea": ["winter melon tea", "boba", "grass jelly", "sago"],
    "winter melon tea": ["winter melon tea"],
    "winter melon latte": ["winter melon", "fresh milk"],
    "grass jelly tea": ["grass jelly", "black tea"],
    "black sesame milk": ["black sesame", "milk", "cheese foam"],
    "thai tea": ["thai tea"]
}

x = open("drinks_data.csv", "w+")
y = open("addons_data.csv", "w+")
with open("yifang_data.csv", "w+") as f:

    for i in range(1, 85000):
        staff_id = random.randint(1, 10)  # Random staff_id between 1 and 10
        payment_method = 'Card' if random.random() < 0.7 else 'Cash'  # 70% Card, 30% Cash
        
        start_date = datetime.date(2022, 1, 1)
        end_date = datetime.date(2022, 12, 31)
        days_between = (end_date - start_date).days
        random_days = random.randint(0, days_between)
        transaction_date = str(start_date + datetime.timedelta(days = random_days))
        
        payment_amounts = 0
        
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
            x.write(str(drink[1][1]) + ", " + str(order_ids) + ", " + drink[0] + ", " + str(drink[1][0]) + ", " + str(topping) + ", " + str(ingredient_dict[drink[0]]) + "\n")
            payment_amounts += drink[1][0] + (topping * 0.75)
            
            for i in range(topping):
                temp = random.choice(toppings)
                y.write(random.choice(toppings) + ", " + str(drinks_dict[drink[0]][1]) + ", " + str(toppings.index(temp) + 1))
                y.write("\n")
            # topping id, 

        f.write(str(order_ids) + ' ')
        f.write(str(staff_id) + ' ')
        f.write(transaction_date + ' ')
        f.write(payment_method + ' ')
        f.write(f'{payment_amounts + (payment_amounts * 0.0725):.2f}' + '\n')

        total += payment_amounts
        order_ids += 1
        
    for i in range(1500):
        staff_id = random.randint(1, 10)  # Random staff_id between 1 and 10
        payment_method = 'Card' if random.random() < 0.7 else 'Cash'  # 70% Card, 30% Cash
        
        payment_amounts = 0
        
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
            x.write(str(drink[1][1]) + ", " + str(order_ids) + ", " + drink[0] + ", " + str(drink[1][0]) + ", " + str(topping) + ", " + str(ingredient_dict[drink[0]]) + "\n")
            payment_amounts += drink[1][0] + (topping * 0.75)
            
            for i in range(topping):
                temp = random.choice(toppings)
                y.write(random.choice(toppings) + ", " + str(drinks_dict[drink[0]][1]) + ", " + str(toppings.index(temp) + 1))
                y.write("\n")
            # topping id, 

        f.write(str(order_ids) + ' ')
        f.write(str(staff_id) + ' ')
        f.write(random.choice(peak_days) + ' ')
        f.write(payment_method + ' ')
        f.write(f'{payment_amounts + (payment_amounts * 0.0725):.2f}' + '\n')

        total += payment_amounts
        order_ids += 1
        

y.close()
x.close()
print(total)