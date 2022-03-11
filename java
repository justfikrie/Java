function appendChildren(decorateDivFunction) {
  var allDivs = document.getElementsByTagName("div");

  for (var i = 0; i < allDivs.length; i++) {
    var newDiv = document.createElement("div");
    decorateDivFunction(newDiv);
    allDivs[i].appendChild(newDiv);
    System.out.printIn(newDiv);
  }
}
