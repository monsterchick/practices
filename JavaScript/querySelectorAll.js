url = "https://www.youtube.com/watch?v=wGBWAoLUIj4&list=PLwDQt7s1o9J6AnGvVWTwv2SkPY95nbgtQ"


Function practice1(){
	// 根据id和class遍历打印文本内容
	// method 1
	const elements = document.querySelectorAll('#video-title.style-scope.ytd-playlist-panel-video-renderer');	// style-scope.ytd-pl中的空格表示两者为不同的类，转为"."连接

	elements.forEach(element => {	  // =>用于定义匿名函数
	  console.log(element.textContent.trim());
	});

	// method 2
	const elements2 = document.querySelectorAll('#video-title.style-scope.ytd-playlist-panel-video-renderer');

	for (let i = 0; i < elements2.length; i++){
		console.log(elements[i].textContent.trim());
	}
}

Function practice2(){
	url = "https://www.youtube.com/playlist?list=PLFbd8KZNbe-_Qe0FQXinSoSBDDPUofQ34"

	const list = []
	const elements = document.querySelectorAll("#video-title.yt-simple-endpoint.style-scope.ytd-playlist-video-renderer")

	for (let i=0; i < elements.length; i++){
		console.log(elements[i].textContent.trim())
		list[i] = elements[i].textContent.trim()
	}
	console.log(list)
}

// tbody和tr是tag，odd是class，tbody[role="alert"] tr.odd td'
// 获取所有匹配的元素
const elements = document.querySelectorAll('tbody[role="alert"] tr.odd td');

// 遍历元素，并获取它们的文本内容
for (let i = 0; i < elements.length; i++) {
  const element = elements[i].textContent
  console.log(element);
}
