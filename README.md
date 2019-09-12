# Metelica_app
micro service applicaton with service descovery &amp; api gateway


Welcome to the Metelica_app wiki! This is normal microservice application.


There are two microservice trade_service and market_data_service. 

1)trade_service call the market_data_service for getting the latest price of metal in market.

2)trade_service discover the url of market_data_service with the help of eureka service discovery.

3)
