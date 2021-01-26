1)As a customer, I want to have food from Outlet
Given that I am new Customer
When I begin Order for food
Then I expect my foodcart to be empty

----------------------------------------------------------
2)As a customer,I want to add items to my food cart and see subtotal of the foodcart
Given I have an empty foodcart
When I add an item
Then I expect the subtotal to be the price of the item
Given I have a foodcart with some items
When I add another item
Then I expect the subtotal to reflect the sum of all the items in my foodcart

--------------------------------------------------------------
3)As a customer,I want to see the quantity of the same item in my foodcart
Given I have foodcart with one item
When I add more of that item
Then I expect to see its quantity update on the foodcart


---------------------------------------------------------------------
4) As a customer, I want to see what's in my foodcart
   Given I have an empty foodcart
   When I add items
   Then I expect it to see an itemized list of the items along with their price and quantity
   
--------------------------------------------------------------

5) As a customer, I want to see the on discount items highlighted in my foodcart
   Given I have a foodcart with items that are not on discuount
   When I add an item that's on discuount
   Then I expect to see it highlighted
   Then I expect to reflect changes on the final bill amount
   
------------------------------------------------------------------
6) As a customer, I want to see the extra 10 % discount items ordered between 9:00 PM to 6:00 AM (Apllicable to all items)
   Given I have a foodcart with items that are not on discuount
   When I add an item that's on discuount
   Then I expect to reflect changes on the final bill amount
   
----------------------------------------------------
7) As a customer, I want to get free food for my cart if my order completion takes more then 3 minutes (3 minutes = Customer order completes - customer gave new order)
   Given I have an empty foodcart
   When I add items
   Then I expect to reflect changes on the final bill amount if my order takes more than 3 minutes
8) As a customer, I want to get free food item if Outlet gave my wrong food item
   Given I have an empty foodcart
   When I get items
   Then I expect if I receive wrong food items then I should expect no charge in final bill amount
9) As a customer, I want to get free drink when my purshcase order more than $20
   Given I have an empty foodcart
   When I add items
   Then I should able to get free drink if my order goes more than $20
10) As a customer, I want to get free drink when my purshcase order more than $40
    Given I have an empty foodcart
    When I add items
    Then I should highlighted free food delivery if my order goes more than $40
11) As a special customer, I want to see the 12 % discount for my foodcart
    Given I have foodcart with one item
    When I add more of that item
    Then I expect to see its discount on Totalamount
12) As a customer, I want to be able to remove items from my foodcart
    Given I have a foodcart with items
    When I remove an item
    Then I expect the foodcart to display the updated itemized list
13) As a customer, I want to be able to adjust the quantity of items in my foodcart
    Given I have one item in my foodcart with a quantity of 4
    When I remove one
    Then I expect the foodcart to have 3 of that item.