/*
 * Copyright 2016, OpenRemote Inc.
 *
 * See the CONTRIBUTORS.txt file in the distribution for a
 * full listing of individual contributors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.openremote.app.client;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import org.openremote.app.client.admin.AdminModule;
import org.openremote.app.client.app.AppController;
import org.openremote.app.client.app.AppModule;
import org.openremote.app.client.assets.AssetsModule;
import org.openremote.app.client.apps.ConsoleAppsModule;
import org.openremote.app.client.map.MapModule;
import org.openremote.app.client.mvp.MVPModule;
import org.openremote.app.client.notifications.NotificationsModule;
import org.openremote.app.client.rules.RulesModule;
import org.openremote.app.client.toast.ToastModule;
import org.openremote.app.client.user.UserModule;

@GinModules({
    MVPModule.class,
    ToastModule.class,
    ManagerModule.class,
    AppModule.class,
    MapModule.class,
    AssetsModule.class,
    RulesModule.class,
    NotificationsModule.class,
    ConsoleAppsModule.class,
    AdminModule.class,
    UserModule.class
})
public interface ManagerGinjector extends Ginjector {
    AppController getAppController();
}
