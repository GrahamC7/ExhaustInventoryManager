# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS

A.  Create your subgroup and project by logging into GitLab using the web link provided and using the “GitLab How-To” web link, and do the following:

•  Clone the project to the IDE.

•  Commit with a message and push when you complete each of the tasks listed below (e.g., parts C to J).


Note: You may commit and push whenever you want to back up your changes, even if a task is not complete.


•  Submit a copy of the Git repository URL and a copy of the repository branch history retrieved from your repository, which must include the commit messages and dates.


Note: Wait until you have completed all the following prompts before you create your copy of the repository branch history.


B.  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.

1. README.md, all lines, modified entire README file 


C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

2. mainscreen.html, line 14, title change
3. mainscreen.html, line 19, changed H1
4. mainscreen.html, line 21, changed H2
4. mainscreen.html, line 52, changed H2

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

5. about.html, created about.html in templates directory, added lines 1-46
6. mainscreencontroller.java, added getmapping lines 55-57
7. mainscreen.html, added link to get from mainscreen.html to about.html, lines 22-24


E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

8. bootstrapdata.java, line 31 and 36, added inHousePartRepository implementation 
9. bootstrapdata.java, line 40-113, added four inhouse parts and one outsourced part
10. bootstrapdata.java, line 148-158, added five products to product repository


Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

11. mainscreen.html, added Buy Now button, line 91 next to buttons that delete and update products
12. creation of BuyNowController.java file in controllers, file checks to see whether or not the product the customer wants to buy is in stock or not. If it is in stock it will produce a confirmation of the purchase. If it isn't in stock, a purchase failure will be produced. If the product isn't found, an error will be produced. Controller decrements the inventory by one upon a successful purchase.
13. creation of purchaseSuccess.html file in templates, file produces for a successful purchase notification for the customer
14. creation of purchaseFailure.html file in templates, file produces a failed purchase notification for the customer


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

15. Part.java, inserted variables minInv and maxInv to part entity, lines 40-45
16. Part.java, added min and max default values, lines 53-59
17. Part.java, added getter and setter methods for minInv and maxInd, lines 114-117
18. InhousePart.java, added min and max values, lines 18-19
19. OutsourcedPart.java, added min and max values, lines 18-19
20. InhousePartForm.html, added entry fields for min and max user input, lines 26-30
21. OutsourcedPartForm.html, added entry fields for min and max user input, lines 27-31
22. application.properties, changed persistent database file name, line 6
23. Part.java, added code to enforce that the inventory is between or at the minimum and max value, lines 127-134
24. PartServiceImpl.java, added code to call inventoryVerification method, line 59
25. InhousePartServiceImpl.java, added code to call inventoryVerification method, line 54
26. OutsourcedPartServiceImpl.java, added code to call inventoryVerification method, line 52
27. Mainscreen.html, added minimum and maximum inventory table headers, lines 44-45
28. Mainscreen.html, added table data for min and max inventory, lines 54-55
29. BootStrapData.java, added min and max values for each product, lines 46-47, 60-61, 74-75, 88-89, 110-111

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

30. Created files ValidMinimumProduct.java, MinimumProductValidator.java, and all code contained. Will display error message when product quantity falls below set minimum quantity.
31. Part.java, added ValidMinimumProduct validator, lines 4 and 21
32. EnufPartsValidator.java, checks for minimum value of parts when decrementing via part purchase and will provide an error message if inventory is not sufficient, lines 35-44
33. Created files ValidMaximumProduct.java, MaximumProductValidator.java, and all code contained. Will display error message when product quantity exceeds maximum allowable quantity.
34. Part.java, added ValidMaximumProduct validator, lines 4 and 23
35. InhousePartForm.html, add code to display error message, lines 32-36
36. OutsourcedPartForm.html, add code to display error message, lines 33-37

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

37. PartTest.java, created unit tests for the minimum and maximum fields in the test package, lines 160-195

J.  Remove the class files for any unused validators in order to clean your code.

38. deleted files DeletePartValidator.java and ValidDeletePart.java from validators as they are not used

K.  Demonstrate professional communication in the content and presentation of your submission.