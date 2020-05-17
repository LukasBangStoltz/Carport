      <%
            if (request.getServletContext().getAttribute("widthList") == null) {
                request.getServletContext().setAttribute("widthList", InitializeLists.getCarportWidthList());
            }
            if (request.getServletContext().getAttribute("lengthList") == null) {
                request.getServletContext().setAttribute("lengthList", InitializeLists.getCarportLengthList());
            }
            if (request.getServletContext().getAttribute("flatrooftypelist") == null) {
                request.getServletContext().setAttribute("flatrooftypelist", InitializeLists.getFlatRoofTypeList());
            }
            if (request.getServletContext().getAttribute("raisedrooftypelist") == null) {
                request.getServletContext().setAttribute("raisedrooftypelist", InitializeLists.getRaisedRoofTypeList());
            }
            if (request.getServletContext().getAttribute("raisedroofdegreelist") == null) {
                request.getServletContext().setAttribute("raisedroofdegreelist", InitializeLists.getAllRaisedRoofDegrees());
            }
            if (request.getServletContext().getAttribute("toolshedlengthslist") == null) {
                 request.getServletContext().setAttribute("toolshedlengthslist", InitializeLists.getAllToolShedLengths());
            }
            if (request.getServletContext().getAttribute("toolshedwidthslist") == null) {
                 request.getServletContext().setAttribute("toolshedwidthslist", InitializeLists.getAllToolShedWidths());
            }
             if (request.getSession().getAttribute("requestListAdmin") == null) {
            request.getSession().setAttribute("requestListAdmin", InitializeLists.initRequestList());
            }
              if (request.getSession().getAttribute("requestListCustomer") == null) {
              request.getSession().setAttribute("requestListCustomer", InitializeLists.initRequestListCustomer((int) session.getAttribute("userId")));
              }
     %>