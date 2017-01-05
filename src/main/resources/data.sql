insert into inventoryapp.products (sku, product_name, product_price, inventory) values ('1001', 'Sticker', '6', '22');
insert into inventoryapp.products (sku, product_name, product_price, inventory) values ('1015', 'T-Shirt', '25', '6');
insert into inventoryapp.products (sku, product_name, product_price, inventory) values ('1026', 'Sweatshirt', '40', '11');

insert into inventoryapp.users (user_first_name, user_last_name, user_email, user_phone_number) values ('John', 'Smith', 'jsmith@abc.com', '5552226666');
insert into inventoryapp.users (user_first_name, user_last_name, user_email, user_phone_number) values ('Eve', 'Rogers', 'erogers@abc.com', '5552226688');
insert into inventoryapp.users (user_first_name, user_last_name, user_email, user_phone_number) values ('Bobby', 'Drake', 'srogers@abc.com', '5552226999');

insert into inventoryapp.transactions (user_id, product_id, transaction_date) values (1, 1, 'January 30th, 2016');
insert into inventoryapp.transactions (user_id, product_id, transaction_date) values (2, 3, 'September 12th, 2016');
insert into inventoryapp.transactions (user_id, product_id, transaction_date) values (3, 2, 'November 1st, 2016');

