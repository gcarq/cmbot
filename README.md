# cmbot


[![Build Status](https://travis-ci.org/yashino91/cmbot.svg?branch=master)](https://travis-ci.org/yashino91/cmbot)
[![codecov](https://codecov.io/gh/yashino91/cmbot/branch/master/graph/badge.svg)](https://codecov.io/gh/yashino91/cmbot)


A simple telegram bot written in Kotlin, for fetching price information about crypto currencies from CoinMarketCap. 

![Alt text](/screenshots/example.png?raw=true "Bot Example - Formatted as a String or rendered as an Image")


As seen above the result can be displayed in 2 different ways:
1. Rendered as an Image. Just use a single slash / for the command. I.e. /eth
2. Formatted as a String with a Link to CoinMarketCap. Use double slash // for the command. I.e. //eth 

You can try it out  [here](https://telegram.me/PriceLeechBot).


## Installation

In order to run the bot on your own machine, you have to set your telegram bot api token as an environment variable:


```sh
$ export CMBOT_TELEGRAM_TOKEN=YOUR_API_KEY
```

[Download](https://github.com/yashino91/cmbot/releases) the latest jar release and run the following command:

```sh
$ java -jar cmbot-<version>.jar
```


## Build from Source


```sh
$ git clone https://github.com/yashino91/cmbot.git
$ cd cmbot/
$ mvn assembly:assembly
```



### Run application using Docker

```sh
$ docker build -t cmbot .
$ docker run -e "CMBOT_TELEGRAM_TOKEN=YOUR_API_KEY" cmbot
```

### Run application without Docker

```sh
$ java -jar target/cmbot-<version>.jar
```

## Configuration
The configuration is done in the config.yaml file, located in the resource directory.

| Key 			               | Value 								                |
| -----------------------------|-------------------------------------------------------|
| botName 	                   | Name of your Telegram Bot				                |
| allowedCurrencySlugs         | Array of currency slugs that are allowed to request. If empty every currency is allowed |
| stringCommand                | Command to request currency details as a formatted string |
| imageCommand                 | Command to request currency details as a rendered image |
| autoclearMessages            | Deletes sent photo messages automatically if enabled |
| autoclearMessagesDurationSec | Number in seconds after sent photo messages should be deleted |