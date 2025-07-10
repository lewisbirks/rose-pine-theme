package io.jenkins.plungins.theme.rosepine;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.Theme;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import io.jenkins.plugins.thememanager.ThemeManagerFactoryDescriptor;
import java.util.List;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class RosePineTheme extends ThemeManagerFactory {

    static final String CSS = "rose-pine.css";
    static final String ID = "rose-pine";

    @DataBoundConstructor
    public RosePineTheme() {
        // Stapler
    }

    @Override
    public Theme getTheme() {
        return Theme.builder()
            .withCssUrls(List.of(getCssUrl()))
            .build();
    }

    @Extension
    @Symbol("rose-pine")
    public static class DescriptorImpl extends ThemeManagerFactoryDescriptor {

        @Override
        public String getThemeKey() {
            return ID;
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new RosePineTheme();
        }

        @Override
        public String getThemeCssSuffix() {
            return CSS;
        }

        @NonNull
        @Override
        public String getDisplayName() {
            return "RosePine";
        }

        @Override
        public String getIconClassName() {
            return "symbol-rose-pine plugin-rose-pine-theme";
        }

        @Override
        public String getThemeId() {
            return ID;
        }

        @Override
        public boolean isNamespaced() {
            return true;
        }
    }
}
