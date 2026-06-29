# Research Day 02

## Q1. What is a Java generic type? Why is <T> useful?
A generic type is a class or method that works with any data type
using a placeholder like <T>. It is useful because it lets you write
one class that can hold any type of data without duplicating code.
For example Response<CategoryDto> and Response<String> both use the
same Response class but with different data types inside.

## Q2. What does Lombok @Builder generate behind the scenes?
@Builder generates a static inner Builder class with setter-like
methods for each field. Instead of using a constructor with many
arguments you can chain methods like Response.builder()
.statusCode(200).message("OK").build() which is much more readable.

## Q3. What is the Builder design pattern? When to use it?
The Builder pattern is used to construct complex objects step by step.
You use it when an object has many fields and you want to set only
some of them without passing nulls to a constructor. It makes the
code easier to read and avoids long constructor calls.

## Q4. What is LocalDateTime? How is it different from Date?
LocalDateTime is a modern Java class from java.time that represents
a date and time without a timezone. The old Date class is harder to
use, not thread-safe, and mixes date and time in a confusing way.
LocalDateTime is cleaner, immutable, and has better formatting support.

## Q5. Why does a consistent response format matter to frontend developers?
When every API endpoint returns the same shape of JSON the frontend
developer can write one piece of code to handle all responses. They
always know where to find the data, the status code and the message
without checking each endpoint individually. It reduces errors and
speeds up development.

## Q6. What does @JsonInclude(JsonInclude.Include.NON_NULL) do?
It tells Jackson not to include fields that are null in the JSON
output. For example if the data field is null on an error response
it will not appear in the JSON at all, keeping the response clean.

## Q7. What is a static factory method? Why use Response.success(...)?
A static factory method is a static method that creates and returns
an instance of a class. Using Response.success() is better than
new Response<>() because it has a meaningful name that describes
what it does, it sets default values like the timestamp automatically
and it is easier to read and use correctly.

---

## Self-Quiz

### Q1. Why use generic <T> instead of Object for data field?
Using Object would require casting when reading the data which can
cause ClassCastException at runtime. Generics catch type mismatches
at compile time making the code safer and cleaner.

### Q2. Difference between Response<T> and ResponseEntity<T>?
Response<T> is our custom class that wraps the data with statusCode,
message and timestamp. ResponseEntity<T> is a Spring class that
controls the actual HTTP response including headers and HTTP status.
You can use both together: ResponseEntity<Response<CategoryDto>>
gives you HTTP status control AND a consistent response body.

### Q3. If a request fails, what statusCode does Response hold?
The error statusCode like 404 for not found or 400 for bad request.
This is set manually in the error() factory method.

### Q4. Why add a timestamp?
A timestamp tells the client exactly when the response was generated.
This helps with debugging, logging, and caching decisions. It also
helps when comparing responses or tracking when errors occurred.