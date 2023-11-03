# Solace Binders
If you want to get a local instance of Solace PubSub+ running then I recommend following the Getting Started with PubSub+ Standard Edition. 

This how to guide can be found at the following (https://solace.com/products/event-broker/software/getting-started/)

Quick start:

Mac/Linux
```
docker run -d -p 8080:8080 -p 55555:55555 -p 8008:8008 -p 1883:1883 -p 8000:8000 -p 5672:5672 -p 9000:9000 -p 2222:2222 --shm-size=2g --env username_admin_globalaccesslevel=admin --env username_admin_password=admin --name=solace solace/solace-pubsub-standard
```

Windows
```
docker run -d -p 8080:8080 -p 55554:55555 -p 8008:8008 -p 1883:1883 -p 8000:8000 -p 5672:5672 -p 9000:9000 -p 2222:2222 --shm-size=2g --env username_admin_globalaccesslevel=admin --env username_admin_password=admin --name=solace solace/solace-pubsub-standard
```

Local Solace UI

You will be able to access the Local Solace PubSub+ UI by going to localhost:8080 in your local browser.

Username: admin

Password: admin

You will be able to create queues, users, topics and a lot more on the local UI.