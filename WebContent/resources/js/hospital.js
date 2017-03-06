	function goPage(path,action,page) {
		/*System.out.println("action:"+action+"page:"+page);*/
		location.href = path+'?action='+action+'&page='+page;
	}
	/*"${context}/patient.do?action=move&page=loginForm";*/
	function goList(path,action,page,pageNO) {
		location.href = path+'?action='+action+'&page='+page+'&pageNO='+pageNO;
	}