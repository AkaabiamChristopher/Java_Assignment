school_records = {
    "class_1":{
        "student":[
            {"name": "Harry", "scores":{"math": 88, "English": 76}},
            {"name": "solomon", "scores":{"math": 95, "English": 89}},
        ]
    },
    "class_2":{
        "student":[
            {"name": "Daniel", "scores":{"math": 78, "English": 72}},
            {"name": "samuel", "scores":{"math": 85, "English": 80}},
        ]
    }
}
#using .values
total_math_score = 0
number_of_students = 0
for v in school_records.values():
    print(v)
    for student in v["student"]:
        total_math_score += student["scores"]["math"]
        number_of_students += 1

average_math_score = total_math_score / number_of_students

print("Average Math Score:", average_math_score)