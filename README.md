# KafkaStarterProject
_Starter project for kafka learning_

## Commands to get started:

### Start zookeeper instance

**_The commands are for windows. These are run from the kafka bin directory with the config file residing inside the config directory_**

Go to /kafka/bin/windows and run the following command:

-> zookeeper-server-start.bat C:\kafka_2.13-3.9.0\config\zookeeper.properties


### Start Kafka Broker

**_The commands are for windows. These are run from the kafka bin directory with the config file residing inside the config directory_**

Go to /kafka/bin/windows and run the following command

-> kafka-server-start.bat C:\kafka_2.13-3.9.0\config\server.properties


### Start Kafka Consumer
**_The commands are for windows. These are run from the kafka bin directory_**

Go to /kafka/bin/windows and run the following command

-> kafka-console-consumer --topic kafkatopic --from-beginning --bootstrap-server localhost:9092
