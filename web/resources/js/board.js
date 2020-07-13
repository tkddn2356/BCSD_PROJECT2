console.log("reply Module.....");
var boardService = (function () {
    function getList(category, callback,  error){
        $.getJSON("/board/list/"+ category,
            function (list) {
                if(callback){
                    callback(list);
                }
            }).fail(function (xhr, status, err) {
            if(error){
                error();
            }
        });
    }

    return {
        getList:getList
    };
})();