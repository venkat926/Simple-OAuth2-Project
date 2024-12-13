# Simple-OAuth2-Project
# OAuth2 Login with Spring Boot

This project demonstrates to implement OAuth2 login functionality in a Spring Boot application using GitHub as the authentication provider.
Users can log in to the application by clicking a button on the login page, which redirects them to GitHub for authentication.

---

## Features

- OAuth2 authentication with GitHub.
- Secured routes accessible only after successful login.


---

## Prerequisites

- **Java**
- **Maven**
- A **GitHub Developer Account** for creating an OAuth2 application.

---

## Setup

### 1. Register an OAuth Application on GitHub
1. Go to [GitHub Developer Settings](https://github.com/settings/developers).
2. Click **"New OAuth App"** and fill out the required details:
    - **Application Name**: `Spring Boot OAuth2 App`
    - **Homepage URL**: `http://localhost:8080`
    - **Authorization Callback URL**: `http://localhost:8080/login/oauth2/code/github`
3. Save the application and copy the **Client ID** and **Client Secret**.

---

### 2. Configure the Application

Update `application.yml` with your GitHub Client ID and Client Secret:

```yaml
spring:
  security:
    oauth2:
      client:
        registration:
          github:
            client-id: YOUR_CLIENT_ID
            client-secret: YOUR_CLIENT_SECRET

```

---
### 3. Hit any application API or ```http://localhost:8080/login```