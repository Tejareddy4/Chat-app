Real-Time Chat Application
This is a simple, real-time chat application built with Spring Boot and WebSockets. It allows multiple users to connect and send messages to each other in a shared chat room.

Technologies Used
Backend:

Spring Boot: Framework for building the application.

WebSockets (STOMP): The protocol used for real-time, bidirectional communication.

SockJS: A browser library that provides WebSocket-like functionality with fallback options for older browsers.

Lombok: A library to reduce boilerplate code (e.g., getters, setters) for the ChatMessage model.

Frontend:

HTML: The structure of the web page.

JavaScript: Manages the WebSocket connection and dynamic UI updates.

Bootstrap: A CSS framework used for styling and responsive design.

Prerequisites
To run this application, you will need:

Java 11 or higher: The programming language for the backend.

Maven: A build automation tool for the project.

A modern web browser.

Getting Started
Follow these steps to get a local copy of the project up and running.

1. Build the Project
   Navigate to the project's root directory and use Maven to build the application:

mvn clean install

2. Run the Application
   You can run the application directly from the command line using the Spring Boot Maven plugin:

mvn spring-boot:run

The application will start on http://localhost:8080 by default.

Project Structure
in.tejareddy.chat.app.config.WebSocketConfig.java: Configures the WebSocket message broker and defines the STOMP endpoint (/chat).

in.tejareddy.chat.app.controller.ChatController.java: The controller that handles incoming messages (/app/SendMessage) and broadcasts them to all subscribers (/topic/messages).

in.tejareddy.chat.app.model.ChatMessage.java: A simple Java POJO (Plain Old Java Object) that represents a chat message, containing the sender and content.

src/main/resources/static/chat.html: The static HTML page that serves as the client-side interface for the chat application. It includes the necessary JavaScript to connect to the WebSocket and handle UI interactions.

Key Fixes and Improvements
The client-side code in chat.html was corrected with the help of an AI to resolve several issues:

Correct WebSocket Endpoint: The SockJS connection URL was updated to correctly reference the /chat endpoint.

Message Styling Fix: A critical typo (.class was changed to .className) was fixed to ensure new messages are styled correctly with Bootstrap.

Correct STOMP Destination: The message destination was corrected to include the /app prefix as configured in the backend, allowing messages to be routed to the ChatController.

Mismatched Element IDs: The JavaScript was updated to use the correct HTML element ID (send-message) for retrieving the sender's name.