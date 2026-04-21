# AE2 Web Integration

Please refer to [master branch readme](https://github.com/kuba6000/AE2-Web-Integration/blob/master/README.md)

## 1.21.1 NeoForge Changelog

### v1.0.2

- **Item Icon Display**: Web interface now supports item icons. Export icons using [IconExporter](https://modrinth.com/mod/icon-exporter) mod and place the output folder in your server root directory.
- **Bilingual UI**: Added English/Chinese language support with automatic browser detection and manual toggle in settings.
- **AdvancedAE Optional**: AdvancedAE is now fully optional — the mod works without it installed.

> **Warning**: Item icon serving does not validate directory safety. Ensure the icon directory contains only expected files. Use at your own risk.

### v1.0.1

- Basic support for AdvancedAE
- Port to 1.21.1 NeoForge

---

### Item Icon Setup

1. Install [IconExporter](https://modrinth.com/mod/icon-exporter) on a **client** with the same mods as your server.
2. Set image size to **64px** in IconExporter config (default 64 is fine, but verify it's not lower to avoid blurry icons).
3. Start a single-player world and run `/iconexporter export` to generate icons.
4. Copy the `icon-exports-x64` folder to your **server root** directory (same level as `mods/`).
5. Configure the icon directory in `ae2webintegration-client.toml` if needed (default: `icon-exports-x64`).
