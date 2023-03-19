# GraphQL-Test
Just a test for Sping and GraphQL

## GraphQL Queries
* Get all "methods"
```graphql 
{
    __schema {
        queryType {
            fields {
                name
            }
        }
        mutationType {
          fields {
            name
          }
        }
    }
}
```
