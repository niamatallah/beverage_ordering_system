# Beverage Ordering System
#### Video Demo:  <https://www.youtube.com/watch?v=ftcg6AhjyKY>
#### Description:

## Label class
this label class has all of the graphical user interface features from the actual label frame, buttons, to the text field that allows the user to type in how many glasses of drinks he would like to have. The label class has an override method actionPerformed that if the user clicks on the add item button it adds the drink chosen, and try catch exception that if the user clicks on the button without any input. This class also has that if the user clicks on order button it displays the order message with the price, size and amount of drinks ordered.

## Beverage class
thid class contains the setter and getter of the parameters size, amount, and price, it also has a overrides a method to display a message on the bottom  of the screen that mentions the amount and size of drinks ordered

## Coffee class

this class uses the joptionpane for the dialog box and it inherits the beverage class, it uses showConfirmDialog to show a pop up  dialog box that gives you the choice if you want to add milk for your coffee. the class has an if statement for the specified prices for each size. Finally, the class has  an override method that displays the coffee if it's with milk or not.

## Juice class 
 For the juice class it inherits the beveragee class and there is an array list of fruits that can be chosen, there is a try catch to handle NullPointerException, and the if statement indicates if the size equals to this then the price changes 

 ## Tea class
 the tea class inherits from the beverage class and has an if statement that contains a showConfirmDialog and a yes or no option pop up if the user selects the tea drink so  he can add sugar,  there is also another if statement that if the size of the tea is small, medium or large then the price changes accordingly multiplying by the price of the sugar as well

 ## Water class

 the water class inherits from the beverage class, this  time the user can choose if he'd like to add ice, then the price changes accordingly with the size of the glass of water and if the user selected ice or not,  there is an override method that displays the parameters of the drink chosen with or without ice.
