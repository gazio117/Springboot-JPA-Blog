let index = {
    init: function(){
        $("#btn-save").on("click",()=>{  //()=>{} this를 바인딩하기 위해서 사용!!
            this.save();
        });
    },

    save: function(){
        
        let data = {
            username: $("#username").val(),
            password: $("#password").val(),
            email: $("#email").val()
        };

        // ajax 호출시 default가 비동기 호출
        $.ajax({
            type: "POST",
            url: "/blog/api/user",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        }).done(function(resp){
            alert("회원가입이 완료되었습니다.");
            location.href = "/blog";
        }).fail(function(error){
            alert(JSON.stringify(error))
        });

    }
}

index.init();