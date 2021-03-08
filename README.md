# Secretkeeper  0.1
  
Tiny java webapp with DB connection and basic encryption.  
(learning/testing project)  
  
Tech.: Maven + SpringBoot + JSP + Tomcat + Hibernate + MySQL.  
Made in IntelliJ IDEA Community Edition under MIT License.  
  
  
#### Longer Description
  
"Secret for a secret".  
Keeps only a single row, but shows the old text to the submitter before it is overwritten by the new text.  
Saves a timestamp and an encrypted text (AES+Base64).  
  
Supports Jasypt (PBEWithMD5AndDES) for DB password encryption.  
  
#### Launching app

1. Fill-in DB info and SecretKey in application.properties. SecretKey must be Base64 (used to encrypt the Secrets).
2. Compile (mvn clean package) and place war in tomcat/webapps and (re)start the server. With Jasypt encrypted passwords, run *set JAVA_OPTS="-Djasypt.encryptor.password=Your_Encryption_Key"* before starting catalina.bat.    

  
