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

<div id="addDeleteCard">
    <button type="button" id="delButton" value="Del" onclick="" class="add-delete-button">-</button>
    <button type="button" id="addButton" value="Add" onclick="addCard()" class="add-delete-button">+</button>
</div>

<div id="gridListView" class="grid-list-div">
    <button type="button" id="listButton" value="List" onclick="gridListToggle(this)" class="grid-list-button">List</button>
    <button type="button" id="gridButton" value="Grid" onclick="gridListToggle(this)" class="grid-list-button active">Grid</button>
</div>

<div style="border: solid;border-width: 1px;height: auto;">
    <button class="prev" onclick="prev()">Previous</button>
    <button class="next" onclick="next()">Next</button>


    <div id="gridListContainer" class="container">
      <@collaborateTaskWidget taskHeader="Test Header" taskDesc="Test Description" appliedCount="10" isActive=true gridOrListWidget="grid" index="1"/>
      <@collaborateTaskWidget taskHeader="Test Header" taskDesc="Test Description" appliedCount="10" isActive=true gridOrListWidget="grid" index="2"/>
    </div>


    <@collaborateCard />

</div>
</body>

<#macro collaborateTaskWidget taskHeader taskDesc appliedCount isActive gridOrListWidget index>
    <div id="first${index}" class="widget ${gridOrListWidget} <#if isActive>active</#if>"  onclick="ajaxCall()">
        <div class="widget-header" style="">
            <h5 class="widget-header-title">
                ${taskHeader}
            </h5>
        </div>
        <div class="widget-description">
            ${taskDesc}
        </div>
        <div class="widget-bottom-div">
            Applied Count:
                   <span class="circled-span">
                       ${appliedCount}
                   </span>
        </div>
    </div>
</#macro>


<#macro collaborateCard>
    <div id="overlayDiv" class="ui-widget-overlay ui-front hidden"></div>
    <div id="collaborateCard" class="ui-widget ui-front ui-widget-content ui-corner-all ui-widget-shadow collaborate-card hidden">
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