# Mock Data Generation Service 📊

<p align="center">
  <img src="https://p7.hiclipart.com/preview/391/315/584/black-white-computer-icons-coin-money-coin-ico.jpg" alt="Financial Instruments Logo" width="200"/>
  <br>
  <em>Real-time financial instrument data simulation service for the Financial Instruments Platform</em>
</p>

## 📋 Overview

Mock Data Generation Service is a Spring Boot application that simulates real-time financial instrument data. It provides REST endpoints and WebSocket connections for generating and streaming mock financial data for testing and demonstration purposes.

## 🛠️ Technology Stack

### Core
- **Framework**: Spring Boot 3.3.x
- **Language**: Java 17
- **Documentation**: SpringDoc OpenAPI UI
- **WebSocket**: Spring WebSocket
- **Reactive Programming**: RxJava 3

### Key Dependencies
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <version>3.3.0</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-websocket</artifactId>
        <version>3.3.1</version>
    </dependency>
    <dependency>
        <groupId>io.reactivex.rxjava3</groupId>
        <artifactId>rxjava</artifactId>
        <version>3.1.8</version>
    </dependency>
</dependencies>
```

## 📈 Features

### Data Generation
- Real-time price simulation
- Multiple instrument support
- Configurable update intervals
- Realistic market behavior simulation

### Available Instruments
- AAPL
- GOOGL
- MSFT
- AMZN
- FB
- TSLA
- NVDA
- JPM
- V
- JNJ
- WMT
- PG
- DIS
- NFLX
- PYPL

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- Maven
- IDE (IntelliJ IDEA recommended)

### Installation

```bash
# Clone the repository
git clone https://github.com/financial-instruments-platform/mock-data-generation-service.git

# Navigate to project directory
cd mock-data-generation-service

# Install dependencies
mvn clean install

# Run the application
mvn spring-boot:run
```

## 📚 API Documentation

Access the Swagger UI documentation at:
```
https://mock-data-generation-service.onrender.com/swagger-ui.html
```

### Sample API Request
```bash
GET /api/mockdata/{symbol}
```

### Sample Response
```json
{
  "symbol": "AAPL",
  "price": 150.25,
  "timestamp": "2024-02-14T12:00:00Z",
  "change": 0.75
}
```

## ⚠️ Important Note
> **First Request Delay**: Since this application is hosted on Render's free tier, the server enters a sleep state after 15 minutes of inactivity. When you make your first request, the server needs to wake up, which can take up to 30-60 seconds. Subsequent requests will work normally.

## 🔗 Related Services
- [Financial Instruments Frontend](https://github.com/financial-instruments-platform/financial-instruments-platform-frontend)
- [Financial Instruments Backend](https://github.com/financial-instruments-platform/financial-instruments-platform-backend)

## 👥 Author

- **Konstantine Vashalomidze** - _Initial work_ - [GitHub](https://github.com/KonstantineVashalomidze)

---

<p align="center">
  Made with ❤️ by <a href="https://github.com/KonstantineVashalomidze">Konstantine Vashalomidze</a>
  <br>
  <sub>Part of the Financial Instruments Platform</sub>
</p>