CREATE DATABASE mini_dish_db;
CREATE USER mini_dish_db_manager WITH PASSWORD '1234';
GRANT CONNECT ON DATABASE mini_dish_db TO mini_dish_db_manager;
GRANT CREATE ON SCHEMA public TO mini_dish_db_manager;

