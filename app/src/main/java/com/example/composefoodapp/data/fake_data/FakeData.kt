package com.example.composefoodapp.data.fake_data

import com.example.composefoodapp.domain.models.Food
import java.util.UUID

class FakeData {
    companion object {
        fun fakeFoodAll() = listOf(
            Food(
                id = UUID.randomUUID().toString(),
                title = "Pizza",
                price = "450",
                imageUrl = "https://avatars.mds.yandex.net/i?id=a01bbf68baecb955aa47f7c84be712749240a06b-4079503-images-thumbs&n=13",
                shortDescription = "Pizza \"FOUR CHEESES\"",
                description = "Pizza on a thin crust with a special fresh tomato sauce and spicy cheeses: cheddar, roqueforti, mozzarella and parmesan. Diameter 30 cm."
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Salad",
                price = "860",
                imageUrl = "https://avatars.mds.yandex.net/i?id=611983779106df61761ba20d9a1032cc97c6f1a9-9182266-images-thumbs&n=13",
                shortDescription = "Mix vegetables inggridients",
                description = "",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Burgers",
                price = "25550",
                imageUrl = "https://avatars.mds.yandex.net/i?id=f5c2b69aa6c4ce7dd67011f7e39872543fbe5e2f-8744212-images-thumbs&n=13",
                shortDescription = "Big burger with delivery",
                description = "",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "ECLAIR",
                price = "600",
                imageUrl = "https://st.bmshop.net/mark13556/product/m/1612e14a9-638a2180429da.jpg",
                shortDescription = "Set of eclairs",
                description = "Mini eclairs with pistachio and vanilla flavors.",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Desserts",
                price = "3359",
                imageUrl = "https://i.pinimg.com/originals/f7/b5/78/f7b578cfd73d46dc5f21fd1f8a46ab99.jpg",
                shortDescription = "sweetie",
                description = "",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Salad",
                price = "850",
                imageUrl = "https://avatars.mds.yandex.net/i?id=611983779106df61761ba20d9a1032cc97c6f1a9-9182266-images-thumbs&n=13",
                shortDescription = "",
                description = "",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Eybisi Salad Mix",
                price = "1200",
                imageUrl = "https://mykaleidoscope.ru/x/uploads/posts/2022-10/1666153455_66-mykaleidoscope-ru-p-tsekhton-salat-s-govyadinoi-instagram-66.png",
                shortDescription = "Mix vegetables inggridients",
                description = "Boiled udon noodles, chicken fillet, vegetable mix, ginger juice, chicken broth, vegetable oil, turmeric, parsley leaves, refined deodorized sunflower oil, sesame oil, cilantro, sesame seeds.",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Pizza",
                price = "450",
                imageUrl = "https://avatars.mds.yandex.net/i?id=a01bbf68baecb955aa47f7c84be712749240a06b-4079503-images-thumbs&n=13",
                shortDescription = "Pizza \"FOUR CHEESES\"",
                description = "Pizza on a thin crust with a special fresh tomato sauce and spicy cheeses: cheddar, roqueforti, mozzarella and parmesan. Diameter 30 cm."
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Burger",
                price = "2550",
                imageUrl = "https://avatars.mds.yandex.net/i?id=f5c2b69aa6c4ce7dd67011f7e39872543fbe5e2f-8744212-images-thumbs&n=13",
                shortDescription = "BIG BIRTHDAY BURGER",
                description = "Big burger with delivery in Moscow and the Moscow region. The weight of the huge beef burger is 1700 g. The natural chopped beef patty is served on a freshly baked large bun with sesame seeds, fresh natural vegetables,",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Chicken",
                price = "350",
                imageUrl = "https://yandex.ru/images/search?from=tabbar&img_url=https%3A%2F%2Fwww.pinpng.com%2Fpngs%2Fm%2F646-6464076_der-aufruf-chicken-hot-wings-kfc-hd-png.png&lr=10310&pos=3&rpt=simage&text=chicken%20food%20kfs",
                shortDescription = "Chief Basket Original",
                description = "Chef Basket is a top chicken set made from original or spicy chicken pieces. Choose what you like."
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Twister",
                price = "200",
                imageUrl = "https://i.ytimg.com/vi/42dDXTeBbrI/maxresdefault.jpg",
                shortDescription = "Twister Summer in KFSTwister Summer in KFS",
                description = "Twister Summer is a crispy chicken with fresh vegetables wrapped in a soft tortilla, and to feel the taste of summer, they added a spicy oriental sauce"
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Panna cotta",
                price = "350",
                imageUrl = "https://i.pinimg.com/originals/f7/b5/78/f7b578cfd73d46dc5f21fd1f8a46ab99.jpg",
                shortDescription = "Panna Cotta",
                description = "",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Panna cotta",
                price = "350",
                imageUrl = "https://i.pinimg.com/originals/f7/b5/78/f7b578cfd73d46dc5f21fd1f8a46ab99.jpg",
                shortDescription = "Panna Cotta",
                description = "",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Gradient ",
                price = "1650",
                imageUrl = "https://cdn1.ozone.ru/s3/multimedia-f/6528283887.jpg",
                shortDescription = " Collection Macarons \"GRADIENT\"",
                description = "Traditional French almond cakes in four flavors, made in a single color scheme, will become a real decoration of any festive table.",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "cupcake",
                price = "1950",
                imageUrl = "https://i.pinimg.com/originals/f7/b5/78/f7b578cfd73d46dc5f21fd1f8a46ab99.jpg",
                shortDescription = "Assorted cupcake berry ",
                description = "A juicy fruit and berry set of cupcakes, where the apple one resembles homemade tender strudel, and the carrot one is a new classic loved by everyone. Cheesy sweet cream and fresh berries.",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "ECLAIR",
                price = "600",
                imageUrl = "https://st.bmshop.net/mark13556/product/m/1612e14a9-638a2180429da.jpg",
                shortDescription = "Set of eclairs",
                description = "Mini eclairs with pistachio and vanilla flavors.",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Easy Greak Salad",
                price = "850",
                imageUrl = "https://www.mygreekdish.com/wp-content/uploads/2013/05/Traditional-Greek-Salad-recipe-Horiatiki-Xoriatiki-1-scaled.jpg",
                shortDescription = "This easy breezy salad with tomatoes",
                description = "Combine the tomatoes, cucumber, onion, bell pepper, and olives in a large bowl. Toss with the dressing. Sprinkle with cheese and serve.",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "CAESAR salad ",
                price = "2600",
                imageUrl = "https://mykaleidoscope.ru/x/uploads/posts/2022-10/1666779653_49-mykaleidoscope-ru-p-tsezar-s-kurinoi-grudkoi-pinterest-52.jpg",
                shortDescription = "With Chicken breast",
                description = "Salad of tender chicken fillet, fresh vegetables, crispy croutons and Parmesan cheese with Caesar dressing.",
            ),
        )

        fun fakeHealthyFood() = listOf(
            Food(
                id = UUID.randomUUID().toString(),
                title = "Salad",
                price = "850",
                imageUrl = "https://avatars.mds.yandex.net/i?id=611983779106df61761ba20d9a1032cc97c6f1a9-9182266-images-thumbs&n=13",
                shortDescription = "",
                description = "",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Eybisi Salad Mix",
                price = "1200",
                imageUrl = "https://mykaleidoscope.ru/x/uploads/posts/2022-10/1666153455_66-mykaleidoscope-ru-p-tsekhton-salat-s-govyadinoi-instagram-66.png",
                shortDescription = "Mix vegetables inggridients",
                description = "Boiled udon noodles, chicken fillet, vegetable mix, ginger juice, chicken broth, vegetable oil, turmeric, parsley leaves, refined deodorized sunflower oil, sesame oil, cilantro, sesame seeds.",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Easy Greak Salad",
                price = "850",
                imageUrl = "https://www.mygreekdish.com/wp-content/uploads/2013/05/Traditional-Greek-Salad-recipe-Horiatiki-Xoriatiki-1-scaled.jpg",
                shortDescription = "This easy breezy salad with tomatoes",
                description = "Combine the tomatoes, cucumber, onion, bell pepper, and olives in a large bowl. Toss with the dressing. Sprinkle with cheese and serve.",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "CAESAR salad ",
                price = "2600",
                imageUrl = "https://mykaleidoscope.ru/x/uploads/posts/2022-10/1666779653_49-mykaleidoscope-ru-p-tsezar-s-kurinoi-grudkoi-pinterest-52.jpg",
                shortDescription = "With Chicken breast",
                description = "Salad of tender chicken fillet, fresh vegetables, crispy croutons and Parmesan cheese with Caesar dressing.",
            ),
        )

        fun fakeJunkFood() = listOf(
            Food(
                id = UUID.randomUUID().toString(),
                title = "Pizza",
                price = "450",
                imageUrl = "https://avatars.mds.yandex.net/i?id=a01bbf68baecb955aa47f7c84be712749240a06b-4079503-images-thumbs&n=13",
                shortDescription = "Pizza \"FOUR CHEESES\"",
                description = "Pizza on a thin crust with a special fresh tomato sauce and spicy cheeses: cheddar, roqueforti, mozzarella and parmesan. Diameter 30 cm."
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Burger",
                price = "2550",
                imageUrl = "https://avatars.mds.yandex.net/i?id=f5c2b69aa6c4ce7dd67011f7e39872543fbe5e2f-8744212-images-thumbs&n=13",
                shortDescription = "BIG BIRTHDAY BURGER",
                description = "Big burger with delivery in Moscow and the Moscow region. The weight of the huge beef burger is 1700 g. The natural chopped beef patty is served on a freshly baked large bun with sesame seeds, fresh natural vegetables,",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Chicken",
                price = "350",
                imageUrl = "https://yandex.ru/images/search?from=tabbar&img_url=https%3A%2F%2Fwww.pinpng.com%2Fpngs%2Fm%2F646-6464076_der-aufruf-chicken-hot-wings-kfc-hd-png.png&lr=10310&pos=3&rpt=simage&text=chicken%20food%20kfs",
                shortDescription = "Chief Basket Original",
                description = "Chef Basket is a top chicken set made from original or spicy chicken pieces. Choose what you like."
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Twister",
                price = "200",
                imageUrl = "https://i.ytimg.com/vi/42dDXTeBbrI/maxresdefault.jpg",
                shortDescription = "Twister Summer in KFSTwister Summer in KFS",
                description = "Twister Summer is a crispy chicken with fresh vegetables wrapped in a soft tortilla, and to feel the taste of summer, they added a spicy oriental sauce"
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Panna cotta",
                price = "350",
                imageUrl = "https://i.pinimg.com/originals/f7/b5/78/f7b578cfd73d46dc5f21fd1f8a46ab99.jpg",
                shortDescription = "Panna Cotta",
                description = "",
            ),
        )

        fun fakeDesserts() = listOf(
            Food(
                id = UUID.randomUUID().toString(),
                title = "Panna cotta",
                price = "350",
                imageUrl = "https://i.pinimg.com/originals/f7/b5/78/f7b578cfd73d46dc5f21fd1f8a46ab99.jpg",
                shortDescription = "Panna Cotta",
                description = "",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "Gradient ",
                price = "1650",
                imageUrl = "https://cdn1.ozone.ru/s3/multimedia-f/6528283887.jpg",
                shortDescription = " Collection Macarons \"GRADIENT\"",
                description = "Traditional French almond cakes in four flavors, made in a single color scheme, will become a real decoration of any festive table.",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "cupcake",
                price = "1950",
                imageUrl = "https://i.pinimg.com/originals/f7/b5/78/f7b578cfd73d46dc5f21fd1f8a46ab99.jpg",
                shortDescription = "Assorted cupcake berry ",
                description = "A juicy fruit and berry set of cupcakes, where the apple one resembles homemade tender strudel, and the carrot one is a new classic loved by everyone. Cheesy sweet cream and fresh berries.",
            ),
            Food(
                id = UUID.randomUUID().toString(),
                title = "ECLAIR",
                price = "600",
                imageUrl = "https://st.bmshop.net/mark13556/product/m/1612e14a9-638a2180429da.jpg",
                shortDescription = "Set of eclairs",
                description = "Mini eclairs with pistachio and vanilla flavors.",
            )
        )
    }
}

