# Metelica_app

There are two microservice **trade_service** and **market_data_service**.
**trade_service** call the **market_data_service** for getting the latest price of metal in market.

**trade_service** discover the url of **market_data_service** with the help of eureka service discovery. For that we have written seperate project name **eurekanamingserver**. All the microserivces register themselves on **eurekanamingserver**

**zuul-api-gateway-server** is api gateway to all the microservice.This act as fronthand layer to all microservices.
