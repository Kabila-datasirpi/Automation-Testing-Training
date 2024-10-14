var xpathExpression = "//div[@class='example']";
var result = document.evaluate(xpathExpression, document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null);

for (var i = 0; i < result.snapshotLength; i++) {
    var element = result.snapshotItem(i);
    $(element).css("color", "red");  // Using jQuery to change the style of XPath-matched elements
}
