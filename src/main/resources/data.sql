INSERT INTO user_details(USER_ID,USER_NAME,USER_ADDRESS,USER_PHONE_NUMBER,CART,ORDERS,WISH_LIST )VALUES
  (1,'yugu', 'nellore', '12345','apple,orange','apple(timestamp),orange(timestamp)','apple,orange'),
 (2,'simin', 'andheri', '12345','apple,orange','apple(timestamp),orange(timestamp)','apple,orange'),
 (3,'debu', 'banglore', '12345','apple,orange','apple(timestamp),orange(timestamp)','apple,orange');

INSERT INTO PRODUCTS(PRODUCT_ID ,CATEGORY,PRODUCT_NAME,PRICE,QUANTITY,DESCRIPTION )VALUES
(1,'Fruits','Apple',120,1000,'good fruit'),
(2,'Vegitables','potato',40,1800,'good vegitable');

Insert INTO DEALERS(DEALER_ID,DEALER_NAME,DEALER_PHONE_NUMBER,SHOP_NAME,SHOP_ADDRESS)values
(1,'yugu',12345,'drunkenMonkey','Earth'),
(2,'debu',12345,'drunkenMonkey','Earth'),
(3,'simin',12345,'drunkenMonkey','Earth');

Insert INTO account_details(user_name,password,roles,is_enabled) values
('yugu','$2a$09$hsrGQHs3AilqjG7gT3nwcO/yVBNB.JN2WEYM7VS3Nc0fZhqruJwhW','ROLE_user',true),
('debu','$2a$09$hsrGQHs3AilqjG7gT3nwcO/yVBNB.JN2WEYM7VS3Nc0fZhqruJwhW','ROLE_user',true),
('simin','$2a$09$hsrGQHs3AilqjG7gT3nwcO/yVBNB.JN2WEYM7VS3Nc0fZhqruJwhW','ROLE_user',true);




