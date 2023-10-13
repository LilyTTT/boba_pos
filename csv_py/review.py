import random

customer_id = 1
order_id = 1
customer_names = ["Emily", "Alexander", "Sophia", "Benjamin", "Olivia", "William", "Ava", "James", "Mia",
"Samuel", "Charlotte", "Daniel", "Emma", "Henry", "Grace", "Liam", "Lily", "Noah", "Isabella", "Ethan"
"Linh", "Kim", "Nishka", "Zach", "Paul", "Max", "Erik", "Abi", "Andrew", "Ryan", "Casey", "Carter", "Jack"]
left_review = False
good_review = False

with open("reviews.csv", "w") as my_file:
    for i in range(1, 86501):
        left_review = random.randint(0,1)
        temp = random.random()
        
        if temp <= 0.9:
            good_review = True
        else:
            good_review = False
        
        if left_review:
            if good_review:
                star = random.randint(4, 5)
            else:
                star = random.randint(1, 3)
           
            my_file.write(str(customer_id )+ "," + str(order_id) + "," + random.choice(customer_names) + "," + str(star) + '\n')
            customer_id += 1
        order_id += 1
    