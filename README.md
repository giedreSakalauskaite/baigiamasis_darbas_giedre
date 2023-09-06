## Project SKYTECH
### SetUp
### Site used for testing
 [SKYTECH](https://www.skytech.lt/)
 ### Packages used for testing
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`

### T.S. 1. Login
#### T.C. 1.1. Login with valid email.
1. Open the site.
2. Click on "prisijunkite".
3. Into email field enter your email "mokinysVCS@gmail.com".
4. Into password field enter your password "mokinysvcs".
5. Press the button "prisijungti".
6. Check if "Mano paskyra" appears at the top.
#### Expected result:
User are able to log in with valid credentials,"Mano paskyra" appears at the top of the site.

#### T.C. 1.2. Login with invalid email.
1. Open the site.
2. Click on "prisijunkite".
3. Into email field enter your email "mokinysVCS@mail.com".
4. Into password field enter your password "mokinysvcs".
5. Press the button "prisijungti".
6. Check if alert message appears.
#### Expected result:
User aren't able to log in with invalid email, alert message appears 
"Neteisingas el. pašto adresas arba / ir slaptažodis.".

### T.S. 2. Change user data
#### T.C. 2.1. change user last name
1. Next to "Vartotojo duomenys" title, click on "Redaguoti".
2. Click on "Pavardė" fied.
3. Enter "Pilipaitienė"
4. Click on "Išsaugoti" button.
5. Check if the last name has changed.
#### Expected result:
Lastname is changed to "Pilipaitienė".

### T.S. 3. Item search
#### T.C.3.1. Searching for item.
1. Click on the "Paieška" field.
2. Enter the "spausdintuvas FujiFilm".
3. Click on the search button.
4. Check if the item which is returned has the words "FujiFilm" or "Printer" in the title.
#### Expected result:
All item which is returned has the words "FujiFilm" or "Printer" in the title.

### T.S. 4. Changing cart status
#### T.C.4.1. Adding item to cart
1. Click on the "Paieška" field.
2. Enter the "Ariete elektrinis kavos aparatas 1368/01" into "Paieška" field.
3. Click on the search button.
4. Add single item into cart, by clicking icon-cart.
5. Check if cart status changes from "Krepšelis yra tuščias" to "Krepšelyje yra 1 prekė".
#### Expected result:
Cart status changes from "Krepšelis yra tuščias" to "Krepšelyje yra 1 prekė".

#### T.C.4.2. Adding and removing item from the cart
1. Click on the "Paieška" field.
2. Enter the "Netatmo Indoor Siren" into "Paieška" field.
3. Click on the search button.
4. Add single item into cart, by clicking icon-cart.
5. Click on the "Krepšelyje yra 1 prekė".
6. Click on remove-icon "x".
7. Check if cart status changes.
#### Expected result:
Cart status changes from "Krepšelyje yra 1 prekė" to "Krepšelis yra tuščias".






