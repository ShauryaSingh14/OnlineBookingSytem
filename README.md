# Online Booking System

## Project Overview

The Online Booking System is a comprehensive web application designed to manage Hotel bookings efficiently. The system provides a user-friendly interface for both customers and administrators, enabling them to manage bookings, hotel packages, and user profiles seamlessly. This project implements a RESTful API backend and a dynamic frontend to handle all necessary operations.

## Features

### Admin Features:
- **Manage Customers**: Add, update, and delete customer profiles.
- **Manage Bookings**: View, approve, or cancel bookings.
- **Manage Travel Packages**: Create, update, and delete travel packages.
- **View Reports**: Generate reports on customer activities and bookings.

### Customer Features:
- **User Registration and Login**: Customers can register and log in to their accounts securely.
- **View Available Travel Packages**: Browse through available travel options and select based on preferences.
- **Book Travel Packages**: Securely book trips with multiple payment options.
- **Manage Profile**: Update personal information and view booking history.
- **Cancel Bookings**: Option to cancel bookings with refund processing.
- **Feedback and Rating**: Provide feedback and rate the services post-travel.

## Technology Stack

### Backend:
- **Java 11**
- **Spring Framework**
  - **Spring Boot**: For rapid application development.
  - **Spring Data JPA**: For database interactions.
  - **Spring Security**: For authentication and authorization.
- **GraphQL**: Database management.
- **PostgreSQL**
- **SMTP Server**: For sending booking confirmation emails.

### Frontend:
- **HTML5**
- **CSS3**
- **TypeScript**
- **React.js**: For creating interactive UIs.
- **Material UI**
- **Bootstrap**: For responsive design.

## Modules

1. **Authentication Module**
   - User Login/Logout
   - Registration with email verification
   - Password recovery

2. **Travel Package Management**
   - CRUD operations for packages
   - Search and filter options
   - Travel itinerary display

3. **Booking Management**
   - Real-time availability check
   - Secure booking process with payment gateway integration
   - Booking confirmation and cancellation

4. **User Profile Management**
   - Profile creation and updates
   - Booking history view
   - Feedback and rating system

5. **Admin Dashboard**
   - Manage customers, bookings, and travel packages
   - View and export reports
   - User management with roles and permissions


## Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/online-travel-management-system.git
   ```

2. **Backend Setup**
   - Navigate to the backend directory:
     ```bash
     cd backend
     ```
   - Configure the `application.properties` file with your MySQL database details.
   - Run the backend application:
     ```bash
     mvn spring-boot:run
     ```

3. **Frontend Setup**
   - Navigate to the frontend directory:
     ```bash
     cd frontend
     ```
   - Install the required packages:
     ```bash
     npm install
     ```
   - Start the frontend application:
     ```bash
     npm start
     ```

4. **Database Setup**
   - Ensure MySQL is running.
   - Run the SQL scripts provided in the `/sql` directory to set up the database schema and initial data.

5. **Running the Application**
   - Access the application on `http://localhost:3000` for the frontend.
   - API endpoints are available at `http://localhost:8080/api`.

## Testing

- **Unit Tests**: Run the following command to execute unit tests:
  ```bash
  mvn test
  ```
- **API Testing**: Use tools like Postman or Swagger to test the RESTful APIs.

## Deployment

- **Frontend**: Host the React application on AWS Amplify for CDN and auto-scaling.
- **Backend**: Deploy the Spring Boot application on AWS Elastic Beanstalk.
- **Database**: GraphQL database can be hosted on AWS RDS.
- **Monitoring**: Use AWS CloudWatch for monitoring API calls and application health.
