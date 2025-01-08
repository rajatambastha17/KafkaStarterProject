# KafkaStarterProject
 Starter project for kafka learning

#Commands to get started:

##============= Start zookeeper instance =============##
## The commands are for windows. These are run from the kafka bin directory with the config file residing inside the config directory
## Go to /kafka/bin/windows and run the following command
zookeeper-server-start.bat C:\kafka_2.13-3.9.0\config\zookeeper.properties


##============= Start Kafka Broker =============##
## The commands are for windows. These are run from the kafka bin directory with the config file residing inside the config directory
## Go to /kafka/bin/windows and run the following command
kafka-server-start.bat C:\kafka_2.13-3.9.0\config\server.properties

##============= Start Kafka Consumer =============##
## The commands are for windows. This is run from the kafka bin directory
## Go to /kafka/bin/windows and run the following command
kafka-console-consumer --topic kafkatopic --from-beginning --bootstrap-server localhost:9092