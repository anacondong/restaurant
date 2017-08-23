# restaurant Promotion Rule price Calculate<br/>

Using Spring Boot >>> MVC,Data,Hibernate<br/>
JAVA 8<br/>
Database >>> MySql<br/>

#### Pre require
Java 8<br/>
Maven<br/>
MY-SQL database connect with Database name : restaurant<br/>

Database Connection :
datasource.url=jdbc:mysql://localhost:3306/restaurant?useUnicode=true&characterEncoding=utf8
username=root
password=
####

#### How to run: 
Download sources “https://github.com/anacondong/restaurant” unzip and 
run command  “mvn clean” <br/>
and “mvn install” <br/>
then “cd target” and  <br/>

run program micro service as <br/>
“java -jar restaurant--SNAPSHOT.jar”<br/>

OR

mvn spring-boot:run <br/>
####


Open browser url : http://localhost:8081/restaurant/

## Add rules Example ##
/****** rule 5 ****/<br/>
5) 5. Pay more 100 get discount 10 Baht<br/>
payment Condition: 100<br/>
discount Payment : 10<br/>
and Leave other field as defult <br/>
EX. customer 1 pay 150 >>> 140,customer 5 pay 20 >>> 90.0<br/>
Apply rule = 5<br/>

/****** rule 6 ****/
6) name : 6. Pay more 50000 get discount 50  %<br/>
payment Condition: 50000 <br/>
promotion Code : DIS50<br/>
discount by Percent : checked<br/>
discount Percent : 50<br/>
and Leave other field as defult <br/>
EX. customer 1 pay 50000, coupon DIS50 >>> 25000.0<br/>
Apply rule = 4,1,5,6 choose 6 for pay least<br/>

<br/>
/****** rule 7 ****/
7) name : 7. come 7 pay 5 <br/>
number Customer : 7<br/>
discount by Group Person : checked<br/>
discount Group Pay for Person: 5<br/>
and Leave other field as defult <br/>
EX. >>> customer 7 ,pay 100  >>> 500<br/>
Apply rule = 7<br/>


Thanks and enjoy Coding
