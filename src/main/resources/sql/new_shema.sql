-- ENUMS
CREATE TYPE dish_type AS ENUM ('STARTER', 'MAIN', 'DESSERT');
CREATE TYPE ingredient_category AS ENUM ('VEGETABLE', 'MEAT', 'OIL', 'SPICE');
CREATE TYPE unit_type AS ENUM ('PCS', 'KG', 'L');

-- TABLE Dish
CREATE TABLE dish (
                      id SERIAL PRIMARY KEY,
                      name VARCHAR(100) NOT NULL,
                      dish_type dish_type NOT NULL,
                      price NUMERIC NULL -- prix de vente (optionnel)
);

-- TABLE Ingredient
CREATE TABLE ingredient (
                            id SERIAL PRIMARY KEY,
                            name VARCHAR(100) NOT NULL UNIQUE,
                            price NUMERIC NOT NULL, -- prix unitaire
                            category ingredient_category NOT NULL
);

-- TABLE de jointure DishIngredient
CREATE TABLE dish_ingredient (
                                 id SERIAL PRIMARY KEY,
                                 id_dish INT NOT NULL REFERENCES dish(id) ON DELETE CASCADE,
                                 id_ingredient INT NOT NULL REFERENCES ingredient(id),
                                 quantity_required NUMERIC NOT NULL,
                                 unit unit_type NOT NULL,
                                 UNIQUE (id_dish, id_ingredient)
);
