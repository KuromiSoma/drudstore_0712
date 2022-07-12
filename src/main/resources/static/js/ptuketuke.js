(function() {
  'use strict';

  var optionLoop, this_day, this_month, this_year, today;
  today = new Date();
  this_year = today.getFullYear();
  this_month = today.getMonth() + 1;
  this_day = today.getDate();

  optionLoop = function(start, end, id, this_day) {
    var i, opt;
    opt = null;
    for (i = start; i <= end ; i++) {
      if (i === this_day) {
        opt += "＜option value='" + i + "' selected>" + i + "＜/option>";
      } else {
        opt += "＜option value='" + i + "'>" + i + "＜/option>";
      }
    }
    return document.getElementById(id).innerHTML = opt;
  };

  optionLoop(1950, this_year, 'birthdayDtYear', this_year);
  optionLoop(1, 12, 'birthdayDtMonth', this_month);
  optionLoop(1, 31, 'birthdayDtDay', this_day);

  optionLoop(this_year, this_year+10, 'expDtYear', this_year);
  optionLoop(1, 12, 'expDtMonth', this_month);
  optionLoop(1, 31, 'expDtDay', this_day);

  optionLoop(this_year-5, this_year+5, 'receiptDtYear', this_year);
  optionLoop(1, 12, 'receiptDtMonth', this_month);
  optionLoop(1, 31, 'receiptDtDay', this_day);

  $('#nkTel').on("keypress", function(event){return leaveOnlyNumber(event);});

  function leaveOnlyNumber(e){
	var st = String.fromCharCode(e.which);
	if ("0123456789".indexOf(st,0) < 0) { return false; }
	return true;
  }

})();