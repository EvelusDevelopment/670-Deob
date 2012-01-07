import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;

final class mka {

   static int c;
   static Object[] g = lfa.a("", 9, "", new Object[1], 0, "");
   static int a;
   static int b;
   static int h;
   static boolean e = false;
   static int f;
   static int d = -1;


   static final boolean a(int var0, int var1) {
      int var2 = 24 % ((2 - var0) / 32);
      ++f;
      return 46 != var1 && var1 != 12 && 19 != var1 && 52 != var1 && var1 != 1001 && var1 != 1009?var1 == 48:true;
   }

   static final boolean a(byte var0, Object[] var1) {
      ++c;
      if(var0 > -34) {
         a((int)50, (Object[])null);
      }

      return true;
   }

   static final Object[] a(int var0, byte[] var1, Object[] var2, int var3, int var4, int var5, Object[] var6, int var7, boolean var8) {
      ++a;
      if(var0 > -53) {
         a(-104, -104);
      }

      Object[] var10 = new Object[10];
      int var11 = var4;
      dka.a(2, var10);
      qb.a(vk.f, var10, var2, var8 && ((boolean[])((boolean[])var6[63]))[23], var7 * var3, -31470, var6);
      if(!((boolean[])((boolean[])((Object[])((Object[])var10[0]))[63]))[24]) {
         ((int[])((int[])var10[9]))[1] = fda.a(var3, (byte)81);
         ((int[])((int[])var10[9]))[0] = fda.a(var7, (byte)81);
      } else {
         ((int[])((int[])var10[9]))[0] = var7;
         ((int[])((int[])var10[9]))[1] = var3;
      }

      if(0 == var4) {
         var11 = var3;
      }

      if(!var8) {
         ((long[])((long[])var10[2]))[0] = IDirect3DDevice.CreateTexture(((long[])((long[])((Object[])((Object[])var10[0]))[50]))[5], ((int[])((int[])var10[9]))[1], ((int[])((int[])var10[9]))[0], 1, 0, wg.a((byte)25, (Object[])((Object[])var10[4]), vk.f), 1);
      } else {
         ((long[])((long[])var10[2]))[0] = IDirect3DDevice.CreateTexture(((long[])((long[])((Object[])((Object[])var10[0]))[50]))[5], ((int[])((int[])var10[9]))[1], ((int[])((int[])var10[9]))[0], 0, 1024, wg.a((byte)11, (Object[])((Object[])var10[4]), vk.f), 1);
      }

      ByteBuffer var12 = (ByteBuffer)((Object[])((Object[])var10[0]))[57];
      var12.clear();
      if(wb.c == var10[4]) {
         var12.put(var1, var5, var7 * var3 / 2);
         IDirect3DTexture.Upload(((long[])((long[])var10[2]))[0], 0, 0, 0, var3, var7 / 4, var3 / 4 * 8, 0, ((long[])((long[])((Object[])((Object[])var10[0]))[50]))[0]);
      } else if(var10[4] == client.Kb) {
         var12.put(var1, var5, var3 * var7);
         IDirect3DTexture.Upload(((long[])((long[])var10[2]))[0], 0, 0, 0, var3, var7 / 4, var3 / 4 * 16, 0, ((long[])((long[])((Object[])((Object[])var10[0]))[50]))[0]);
      } else {
         var12.put(var1, var5, var11 * var7);
         IDirect3DTexture.Upload(((long[])((long[])var10[2]))[0], 0, 0, 0, var3, var7, var11 * ((int[])((int[])((Object[])((Object[])var10[4]))[0]))[0], 0, ((long[])((long[])((Object[])((Object[])var10[0]))[50]))[0]);
      }

      return var10;
   }

   static final void a(int var0, Object[] var1) {
      bga.f_i = 0;
      ++h;
      wba.a = 0;
      tsa.h = aqa.a(new Object[2], 19);
      mba.e = new ub[var0];
      cia.g = new ch[rha.j[dq.h] + 1];
      Class_ss.f = 0;
      ph.e = var1;
      gia.c = 0;
      gr.b(24, var1);
   }

}
