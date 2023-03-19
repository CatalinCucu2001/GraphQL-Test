# GraphQL-Test
Just a simple test application for Spring and GraphQL

## Conversion table (RestAPI -> GraphQL)
| From           | To               | Observations                    |
|----------------|------------------|---------------------------------|
| @RequestBody   | @Argument        | -                               |
| @PathVariable  | @Argument        | -                               |
| And other vars | @Argument        | -                               |
| @GetMapping    | @GetMapping      | Use only for ReadOnly           |
| @PostMapping   | @MutationMapping | Use for Write (and Read result) |

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
