      <%
            if (request.getServletContext().getAttribute("widthList") == null) {
                request.getServletContext().setAttribute("widthList", InitializerLists.getCarportWidthList());
            }
            if (request.getServletContext().getAttribute("lengthList") == null) {
                request.getServletContext().setAttribute("lengthList", InitializerLists.getCarportLengthList());
            }
            if (request.getServletContext().getAttribute("flatrooftypelist") == null) {
                request.getServletContext().setAttribute("flatrooftypelist", InitializerLists.getFlatRoofTypeList());
            }
            if (request.getServletContext().getAttribute("raisedrooftypelist") == null) {
                request.getServletContext().setAttribute("raisedrooftypelist", InitializerLists.getRaisedRoofTypeList());
            }
            if (request.getServletContext().getAttribute("raisedroofdegreelist") == null) {
                request.getServletContext().setAttribute("raisedroofdegreelist", InitializerLists.getAllRaisedRoofDegrees());
            }
            if (request.getServletContext().getAttribute("toolshedlengthslist") == null) {
                 request.getServletContext().setAttribute("toolshedlengthslist", InitializerLists.getAllToolShedLengths());
            }
            if (request.getServletContext().getAttribute("toolshedwidthslist") == null) {
                 request.getServletContext().setAttribute("toolshedwidthslist", InitializerLists.getAllToolShedWidths());
            }

        %>