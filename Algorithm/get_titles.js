var list = [];
var elements = document.querySelectorAll('div.css-98an55-ContentContainer.e17cai631');
for (var i = 0; i < elements.length; i++){
  var divs = elements[i].querySelectorAll('div.css-jevsd5-StyledMenuLabel.e13246w04');
  for (var t = 0; t < divs.length; t++){
    list.push(divs[t].querySelector('span.css-of0k7x-Title.eokqbvu1').textContent);
  }
}
console.log(list);