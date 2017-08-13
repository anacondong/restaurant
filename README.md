# restaurant Promotion Rule price Calculate

Using Spring Boot >>> MVC,Data,Hibernate
JAVA 8
Database >>> MySql

#### Pre require
Java 8
Maven
MY-SQL database connect with Database name : restaurant

Database Connection :
datasource.url=jdbc:mysql://localhost:3306/restaurant?useUnicode=true&characterEncoding=utf8
username=root
password=
####

#### How to run: 
Download sources “https://github.com/anacondong/restaurant” unzip and run command  “mvn clean” and “mvn install” 
then “cd target” and  

run program micro service as 
“java -jar restaurant--SNAPSHOT.jar”
####


Open browser url : http://localhost:8081/restaurant/

## Add rules Example ##
/****** rule 5 ****/
5) 5. Pay more 100 get discount 10 Baht
payment Condition: 100
discount Payment : 10
and Leave other field as defult :)
EX. customer 1 pay 150 >>> 140,customer 5 pay 20 >>> 90.0
Apply rule = 5

/****** rule 6 ****/
6) name : 6. Pay more 50000 get discount 50  %
payment Condition: 50000 
promotion Code : DIS50
discount by Percent : checked
discount Percent : 50
and Leave other field as defult :)
EX. customer 1 pay 50000, coupon DIS50 >>> 25000.0
Apply rule = 4,1,5,6 choose 6 for pay least


/****** rule 7 ****/
7) name : 7. come 7 pay 5 
number Customer : 7
discount by Group Person : checked
discount Group Pay for Person: 5
and Leave other field as defult :)
EX. >>> customer 7 ,pay 100  >>> 500
Apply rule = 7


Thanks and enjoy Coding
