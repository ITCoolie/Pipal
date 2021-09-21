var snode = document.getElementsByTagName('script')[0];
var src = snode.getAttribute("src");
var theRequest = new Object();
if (src.indexOf("?") != -1) {
    var id = src.substr(src.indexOf('?') + 1);
    alert(id);
}
