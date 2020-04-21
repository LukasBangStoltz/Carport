      <%
            if (request.getServletContext().getAttribute("widthList") == null) {
                request.getServletContext().setAttribute("widthList", Initializer.getCarportWidthList());
            }
            if (request.getServletContext().getAttribute("lengthList") == null) {
                request.getServletContext().setAttribute("lengthList", Initializer.getCarportLengthList());
            }
            if (request.getServletContext().getAttribute("flatrooftypelist") == null) {
                request.getServletContext().setAttribute("flatrooftypelist", Initializer.getFlatRoofTypeList());
            }
            if (request.getServletContext().getAttribute("raisedrooftypelist") == null) {
                request.getServletContext().setAttribute("raisedrooftypelist", Initializer.getRaisedRoofTypeList());
            }
            if (request.getServletContext().getAttribute("raisedroofdegreelist") == null) {
                request.getServletContext().setAttribute("raisedroofdegreelist", Initializer.getAllRaisedRoofDegrees());
            }


        %>