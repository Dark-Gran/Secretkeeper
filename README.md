# Secretkeeper  
  
Java webapp with DB connection. (learning/testing project)  
  
Technologies: Maven + SpringBoot + JSP + Hibernate + MySQL.  
Made in IntelliJ IDEA Community Edition under MIT License.
  
  
--- Longer Description ---  
  
"Secret for a secret".  
Keeps only a single row, but shows the old text to the submitter before it is overwritten by the new one.  
Saves timestamp (serves as ID) and encrypted text (to be specified).  
  
Supports Jasypt (PBEWithMD5AndDES) for DB password encryption (app must be run using the encryption key).  
