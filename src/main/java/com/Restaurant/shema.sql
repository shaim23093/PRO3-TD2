\c mini_dish_db;


CREATE TABLE Dish (
                      id INT PRIMARY KEY,
                      name VARCHAR(100) NOT NULL,
                      dish_type dish_type_enum enum {'START', 'MAIN', 'DESSERT'}NOT NULL
);

CREATE TABLE Ingredient (
                            id INT PRIMARY KEY,
                            name VARCHAR(100) NOT NULL,
                            price NUMERIC(10,2) NOT NULL,
                            category ingredient_category enum {'VEGETABLE', 'ANIMAL', 'MARINE', 'DAIRY', 'OTHER'} NOT NULL,
                            id_dish INT,
                            CONSTRAINT fk_dish
                                FOREIGN KEY (id_dish)
                                    REFERENCES Dish(id)
                                    ON DELETE SET NULL
);
