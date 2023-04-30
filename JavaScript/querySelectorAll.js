url = "https://www.youtube.com/watch?v=wGBWAoLUIj4&list=PLwDQt7s1o9J6AnGvVWTwv2SkPY95nbgtQ"


const elements = document.querySelectorAll('#video-title.style-scope.ytd-playlist-panel-video-renderer');	// style-scope.ytd-pl中的空格表示两者为不同的类，转为"."连接

// method 1
elements.forEach(element => {	  // =>用于定义匿名函数
  console.log(element.textContent.trim());
});

// method 2
const elements2 = document.querySelectorAll('#video-title.style-scope.ytd-playlist-panel-video-renderer');

for (let i = 0; i < elements2.length; i++){
	console.log(elements[i].textContent.trim());
}