# REST API for Balgebun Bot

URL: [https://blgbnrest.herokuapp.com](https://blgbnrest.herokuapp.com)

A REST API for 2020 Advanced Programming Course Group Project of Group A15. This repository contains the database service for the LINE bot. All of the endpoints listed here are basic CRUD endpoints for the entity.

## Endpoint Customer

```http
GET /database/customer/
```

```http
POST /database/customer/
```

```http
GET /database/customer/{username}
```

```http
PUT /database/customer/{username}
```

```http
DELETE /database/customer/{username}
```

## Endpoint Seller

```http
GET /database/seller/
```

```http
POST /database/seller/
```

```http
GET /database/seller/{username}
```

```http
PUT /database/seller/{username}
```

```http
DELETE /database/seller/{username}
```

## Endpoint Item

```http
GET /database/item/
```

```http
POST /database/item/
```

```http
GET /database/item/{itemID}
```

```http
PUT /database/item/{itemID}
```

```http
DELETE /database/item/{itemID}
```

## Endpoint Review

```http
GET /database/review/
```

```http
POST /database/review/
```

```http
GET /database/review/{reviewID}
```

```http
PUT /database/review/{reviewID}
```

```http
DELETE /database/review/{reviewID}
```

## Endpoint Purchase

```http
GET /database/purchase/
```

```http
POST /database/purchase/
```

```http
GET /database/purchase/{purchaseID}
```

```http
PUT /database/purchase/{purchaseID}
```

```http
DELETE /database/purchase/{purchaseID}
```