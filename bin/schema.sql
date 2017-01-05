CREATE SCHEMA IF NOT EXISTS inventoryapp;
USE inventoryapp;

CREATE TABLE IF NOT EXISTS inventoryapp.products (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  sku INT NOT NULL,
  product_name VARCHAR(45) NOT NULL,
  product_price DECIMAL NOT NULL,
  inventory INT NOT NULL,
  PRIMARY KEY (id));
  
CREATE TABLE IF NOT EXISTS inventoryapp.users (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_first_name VARCHAR (60) NOT NULL,
  user_last_name VARCHAR (60) NOT NULL,
  user_email VARCHAR(128) NULL,
  user_phone_number VARCHAR(10) NULL,
  PRIMARY KEY (id));
  
CREATE TABLE IF NOT EXISTS inventoryapp.transactions (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id INT UNSIGNED NOT NULL,
  product_id INT UNSIGNED NOT NULL,
  transaction_date VARCHAR(60) NOT NULL,
  PRIMARY KEY (id));
  
  