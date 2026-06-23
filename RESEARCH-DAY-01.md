# Research Day 01

## Q1. What does CRUD stand for?
CRUD stands for Create, Read, Update and Delete. These are the four
basic operations you can perform on data in a database or API.

## Q2. Difference between HTTP methods POST, PUT, PATCH, DELETE?
- POST: used to CREATE a new resource
- PUT: used to UPDATE an entire existing resource
- PATCH: used to UPDATE only part of an existing resource
- DELETE: used to REMOVE an existing resource

## Q3. HTTP Status Codes
a. A new category was created: 201 Created
b. A category was deleted successfully: 204 No Content
c. The id requested does not exist: 404 Not Found
d. The request body is missing a required field: 400 Bad Request
e. The user is logged in but not allowed: 403 Forbidden

## Q4. @RequestBody, @RequestParam, @PathVariable

- @PathVariable: gets a value from the URL path
  Example: GET /api/categories/1
  `public CategoryDto getById(@PathVariable Long id)`

- @RequestParam: gets a value from the URL query string
  Example: GET /api/categories?name=Pizza
  `public List<CategoryDto> search(@RequestParam String name)`

- @RequestBody: gets the full JSON body from the request
  Example: POST /api/categories with body {"name":"Pizza"}
  `public CategoryDto create(@RequestBody CategoryDto dto)`

## Q5. Jakarta Bean Validation
Jakarta Bean Validation is a way to automatically check that data
sent to your API is correct before your code processes it.
- @Valid: tells Spring to validate the object
- @NotBlank: the field must not be null or empty
- @Size: the field must be between a min and max length

## Q6. Why return DTO and not Entity?
1. Security: entities may contain sensitive fields like passwords
   that you dont want to expose to the client
2. Flexibility: DTOs let you shape the response exactly how the
   client needs it without changing the database structure

## Q7. What is Optional<T>?
Optional is a container that may or may not contain a value.
findById returns Optional because the record might not exist in
the database. Instead of returning null, Optional forces you to
handle the case where nothing is found.

---

## Self-Quiz

### Q1. Why ResponseEntity instead of returning the object?
ResponseEntity gives you full control over the HTTP response
including the status code, headers and body. Returning just an
object always gives 200 OK even when that is not appropriate.

### Q2. What status should a successful DELETE return?
204 No Content because the action was successful but there is
nothing to return in the body.

### Q3. Update one field - PUT or PATCH?
PATCH is more correct because PUT is meant to replace the entire
resource. If you only want to change the name, PATCH is the right
choice.

### Q4. What happens if you forget @Valid?
The validation annotations like @NotBlank are ignored and invalid
data goes straight through to your service without being checked.

### Q5. Why must update/delete have {id} but create does not?
Update and delete need to know which specific record to change or
remove. Create generates a new record so there is no existing id yet.