<html>
<head>
<#include "includes.ftl"/>
</head>
<body>
<div id="testSearch" class="ui-search-text">
    <input type="search" placeholder="Roles,Teams,Tags" class="ui-search-box"/>
    <button type="submit" style="color: #cccccc;height: 20px;">
        <span class="ui-icon ui-icon-zoomin" ></span>
    </button>
</div>

<div id="gridListView" class="grid-list-div">
    <button type="button" id="listButton" value="List" onclick="gridListToggle(this)" class="grid-list-button">List</button>
    <button type="button" id="gridButton" value="Grid" onclick="gridListToggle(this)" class="grid-list-button active">Grid</button>
</div>

<section style="border: solid;border-width: 1px;">
    <button class="prev" onclick="prev()">Previous</button>
    <button class="next" onclick="next()">Next</button>


    <ul id="gridListContainer" class="container">
        <li id="first" class="widget grid active"  onclick="ajaxCall()">
            <div class="widget-header" style="">
                <h5 class="widget-header-title">
                    Test Task Header
                </h5>
            </div>
            <div class="widget-description">
                Test Description
            </div>
            <div class="widget-bottom-div">
               Applied Count:
               <span class="circled-span">
                   10
               </span>
            </div>
        </li>

        <li id="second" class="widget grid active">
            <div class="widget-header">
                <h5 class="widget-header-title">
                    Test Second Task Header
                </h5>
            </div>
            <div>
                Test Description
            </div>
        </li>
    </ul>
</section>

<@collaborateCard />
</body>


<#macro collaborateCard>
    <div id="overlayDiv" class="ui-widget-overlay ui-front"></div>
    <div id="collaborateCard" class="ui-widget ui-front ui-widget-content ui-corner-all ui-widget-shadow">
        <div id="header">

        </div>
        <div id="description">
            <textarea id="taskDesc">

            </textarea>
        </div>
        <div id="skillsets">

        </div>
        <div id="duration">
          Duration:

          <input type="text" id="duration">
        </div>
        <div id="learnings">

        </div>
        <div id="dueDate">
          Due Date:

            <input type="text" id="dueDate">
        </div>
        <div id="location">

        </div>
        <div id="applyComplete">
            <span id="applyCompleteButton">
                Create
            </span>
        </div>
    </div>
</#macro>




</html>