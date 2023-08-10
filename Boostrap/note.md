# Boostrap Note

## Shortcut in vscode

| Command | Desc                                                         |
| ------- | ------------------------------------------------------------ |
| picsum  | Generate a random fake image(need to download "Fake Image Snippet Collection") |
| Lorum10 | specific word count with number after Lorum                  |
|         |                                                              |



## Grid System

### 三層包裹

1. container定框 容器
2. row
3. col

### 三種方式

1. 自動分欄

```html
    <div class="container">
      <div class="row">
        <div class="col">
          <p>
            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Ipsam
            reprehenderit culpa maxime, exercitationem voluptatibus est? Dolore,
            officia, nihil tenetur ea quibusdam optio nisi provident omnis
            placeat porro quidem laboriosam asperiores.
          </p>
        </div>
        <div class="col">
          <p>
            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Ipsam
            reprehenderit culpa maxime, exercitationem voluptatibus est? Dolore,
            officia, nihil tenetur ea quibusdam optio nisi provident omnis
            placeat porro quidem laboriosam asperiores.
          </p>
        </div>
        <div class="col">
          <p>
            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Ipsam
            reprehenderit culpa maxime, exercitationem voluptatibus est? Dolore,
            officia, nihil tenetur ea quibusdam optio nisi provident omnis
            placeat porro quidem laboriosam asperiores.
          </p>
        </div>
      </div>
    </div>
```



2. 客製化分欄

```html
    <div class="container">
      <div class="row">
        <!-- 3 of 12 -->
        <div class="col-3">
          <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Corporis,
            facilis? Maiores error dicta ullam culpa laudantium consequatur
            numquam facere laboriosam repudiandae, quo quisquam dolor rem
            obcaecati omnis sequi nostrum harum!
          </p>
        </div>
        <div class="col-3">
          <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Corporis,
            facilis? Maiores error dicta ullam culpa laudantium consequatur
            numquam facere laboriosam repudiandae, quo quisquam dolor rem
            obcaecati omnis sequi nostrum harum!
          </p>
        </div>
        <div class="col-3">
          <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Corporis,
            facilis? Maiores error dicta ullam culpa laudantium consequatur
            numquam facere laboriosam repudiandae, quo quisquam dolor rem
            obcaecati omnis sequi nostrum harum!
          </p>
        </div>
        <div class="col-1">
          <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Corporis,
            facilis? Maiores error dicta ullam culpa laudantium consequatur
            numquam facere laboriosam repudiandae, quo quisquam dolor rem
            obcaecati omnis sequi nostrum harum!
          </p>
        </div>
      </div>
    </div>
```

g-

控制欄間距的部分

```html
      <div class="row g-2">
```

## 對齊與分佈

```html
      <div class="row justify-content-center">		< !-- 在父層設置，子層才有效果 -- >
      <div class="row justify-content-start">		< !-- 相當於justify-content: flex-start -- >
      <div class="row justify-content-end">		< !-- 相當於justify-content: flex-end -- >
        
      <div class="row justify-content-between">		< !-- 剩餘空間分配到每個物件兩側 -- >
      <div class="row justify-content-around">		< !-- 剩餘空間分配到每個物件兩側 -- >
        
      <div class="container h-100"></div>			< !-- 水平垂直居中 -- >
        <div class="row h-100"></div>
```

