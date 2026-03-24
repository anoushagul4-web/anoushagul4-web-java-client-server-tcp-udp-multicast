
---

# Project Overview

This project demonstrates **client–server communication using Java socket programming**. It implements three networking techniques:

* **TCP (Transmission Control Protocol)**
* **UDP (User Datagram Protocol)**
* **Multicast Communication**

The system allows clients to send arithmetic operation requests to a server. The server processes the request and returns the result back to the client.

The TCP implementation also supports **multiple clients simultaneously using multithreading**, demonstrating concurrent client–server communication.

---

# Objectives

The main objectives of this project are:

* Understand **client–server architecture**
* Implement **TCP socket communication**
* Implement **UDP datagram communication**
* Demonstrate **multicast networking**
* Support **multiple client connections using threads**
* Practice **Java network programming**

---

# Technologies Used

* Java (JDK 21)
* Socket Programming
* DatagramSocket
* MulticastSocket
* Visual Studio Code
* GitHub

---

# Project Structure

```
java-client-server-tcp-udp-multicast
│
├── TCPServer.java
├── TCPClient.java
│
├── UDPServer.java
├── UDPClient.java
│
├── MulticastSender.java
├── MulticastReceiver.java
│
└── README.md
```

---

# Client–Server Architecture

Client–server architecture is a distributed computing model where clients request services from a centralized server.

### Workflow

1. Client sends request
2. Server receives request
3. Server processes the request
4. Server sends response
5. Client receives the result

This architecture is widely used in web applications, databases, and cloud systems.

---

# TCP Implementation

TCP provides **reliable communication** between the client and server.

### Features

* Connection-oriented communication
* Reliable data transfer
* Ordered packet delivery
* Multithreading support for multiple clients

### Example Input

```
10 5 add
20 4 mul
30 10 sub
50 5 div
```

### Example Output

```
Server: Result = 15
Server: Result = 80
Server: Result = 20
Server: Result = 10
```

---

# UDP Implementation

UDP provides **faster communication without establishing a connection**.

### Features

* Connectionless protocol
* Lower overhead
* Faster transmission
* No guarantee of packet delivery

The client sends requests using **datagram packets**, and the server processes the request and sends the result back.

---

# Multicast Implementation

Multicast communication allows **one sender to transmit data to multiple receivers simultaneously**.

### Multicast Address Used

```
230.0.0.0
```

### How It Works

1. Multiple receivers join a multicast group
2. The sender sends a message to the multicast address
3. All receivers receive the message

This demonstrates **one-to-many communication**.

---

# How to Run the Project

## Step 1 — Compile the Project

Open terminal and run:

```
javac *.java
```

---

# Running TCP Server and Client

### Start TCP Server

```
java TCPServer
```

### Start TCP Client

Open a new terminal and run:

```
java TCPClient
```

Example input:

```
10 5 add
```

---

# Running UDP Server and Client

### Start UDP Server

```
java UDPServer
```

### Start UDP Client

Open another terminal and run:

```
java UDPClient
```

---

# Running Multicast Communication

### Start Multicast Receiver

```
java MulticastReceiver
```

### Start Multicast Sender

Open another terminal:

```
java MulticastSender
```

Receivers will display:

```
Received: Hello from Multicast Sender
```

---

# Testing

The system was tested with different arithmetic operations to verify functionality.

Example tests:

```
10 5 add
20 4 mul
30 10 sub
50 5 div
```

Multiple TCP clients were also connected simultaneously to demonstrate **multi-client support using threads**.



# Conclusion

This project successfully demonstrates **network communication using TCP, UDP, and multicast protocols in Java**.

The TCP implementation ensures reliable communication and supports multiple clients through multithreading. UDP demonstrates faster communication using datagram packets, while multicast enables efficient one-to-many messaging.

The project provides hands-on experience with **socket programming, networking protocols, and distributed system communication**, which are essential concepts in computer networking and operating systems.



If you want, I can also help you make your README **look much more professional with diagrams, architecture flowcharts, and badges (which makes GitHub projects look much stronger for portfolios)**.
